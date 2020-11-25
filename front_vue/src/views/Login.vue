<template>
  <el-form
      :model="ruleForm"
      :rules="rules"
      ref="ruleForm"
      label-width="100px"
      class="demo-ruleForm"
  >
    <el-form-item prop="user">
      <el-input
          type="text"
          placeholder="请输入手机号或者邮箱号"
          required="required"
          v-model="ruleForm.user"
          prefix-icon="el-icon-user-solid"
      ></el-input>
    </el-form-item>
    <el-form-item prop="pass">
      <el-input
          type="password"
          placeholder="请输入密码"
          prefix-icon="el-icon-lock"
          v-model="ruleForm.pass"
          @keyup.enter.native="toSubmitForm('ruleForm')"
      ></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm('ruleForm')">登录</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  // 两个验证，验证密码不能为空，验证，手机号或者邮箱是否符合要求
  data() {
    var validatePass = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请输入密码'))
      } else {
        callback()
      }
    }
    var validateUser = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('手机号或者邮箱不能为空'))
      } else {
        const reg = /^1[3|4|5|7|8][0-9]\d{8}$/
        // eslint-disable-next-line no-useless-escape
        const reg2 = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/
        if ((reg.test(value) || reg2.test(value))) {
          callback()
        } else {
          callback(new Error('请输入正确的手机号或者邮箱'))
        }
      }
    }
    return {
      // 获取url地址后面的参数
      urlQuery: '',
      activeIndex: '1',
      ruleForm: {
        pass: '',
        user: ''
      },
      rules: {
        user: [{ required: true, validator: validateUser, trigger: 'blur' }],
        pass: [{ required: true, validator: validatePass, trigger: 'blur' }]
      }
    }
  },
}

</script>