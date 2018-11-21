/**
 * Created by 程程有小棉被啊 on 2018/11/21.
 */
// alert(11) 检验js路径等
var vue = new Vue({
    el: "#myContent",// id选择器,用来制定需要渲染数据的div  只能再该id 下方进行渲染
    data: {//数据源
        //pageNo:1,
        pageSize:5,//每页显示条数
        pages:0,//总页数
        pageNum:1,//当前页
        //totalpage:0,
        //msg:"",
        blogs:[]
    },
    //注册分页组件
    components:{
        'vue-nav': Vnav
    },
    created: function () { // vue 组件加载完成后执行的函数
        this.load();
    },
    computed: {
        //计算属性
        total: function () {
            return "100";
        }

    },
    methods: {//绑定事件
        //每次点击分页按钮的时候 出发该函数
        callback(pageNum) {
            this.$data.pageNum = pageNum;
            this.load();
        },
        load: function () {
            var params = {pageNo:this.$data.pageNum,pageSize:this.$data.pageSize}
            this.$http.get("http://localhost:8080/blog/query",{params:params}).then(function (response) {
                //console.log(response)
                var serverResponse = response.body;
                var pageInfo = serverResponse.data;
                this.$data.blogs = pageInfo.list;//将后台返回的数据返回给VUE数据包，数据包会发生改变，并将数据进行渲染
                this.$data.pageNum = pageInfo.pageNum;
                this.$data.pages = pageInfo.pages;
            }, function (err) {

            })
        }
    }

});


var tagVue = new Vue({
    el:"#myTags",
    data:{
        mytags:[]
    },
    created: function () { // vue 组件加载完成后执行的函数
        this.load();
    },
    computed: {
        //计算属性
        total: function () {
            return "100";
        }

    },
    methods: {//绑定事件
        load: function () {
            this.$http.get("http://localhost:8080/blogtags/queryAllTags").then(function (response) {
                console.log(response)
                var serverResponse = response.body;
                var pageInfo = serverResponse.data;
                this.$data.mytags = pageInfo.list;//将后台返回的数据返回给VUE数据包，数据包会发生改变，并将数据进行渲染
            }, function (err) {

            })
        }
    }

})






/*格式化日期*/
function formatDate(date, fmt) {
    if (/(y+)/.test(fmt)) {
        fmt = fmt.replace(RegExp.$1, (date.getFullYear() + '').substr(4 - RegExp.$1.length));
    }
    var o = {
        'M+': date.getMonth() + 1,
        'd+': date.getDate(),
        'h+': date.getHours(),
        'm+': date.getMinutes(),
        's+': date.getSeconds()
    };
    for (let k in o) {
        if (new RegExp(`(${k})`).test(fmt)) {
            let str = o[k] + '';
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length === 1) ? str : padLeftZero(str));
        }
    }
    return fmt;
};

function padLeftZero(str) {
    return ('00' + str).substr(str.length);
}

function parseData(datestr) {
    datestr = datestr.replace(/-/ig, "/");
    return new Date(datestr);
}

//日期格式化过滤器
Vue.filter("formatDate", function (value, fmt) {
    //console.log(parseData(value));
    return formatDate(parseData(value), fmt);
});

