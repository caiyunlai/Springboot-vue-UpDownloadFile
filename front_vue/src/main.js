import Vue from 'vue'
import App from './App.vue'
import router from './router'
import './plugins/element.js'
import './components/common/directives'
import uploader from "vue-simple-uploader";

Vue.use(uploader)
Vue.config.productionTip = false

new Vue({
  router,
  //store,
  render: h => h(App)
}).$mount('#app')
