<script setup>
import axios from "axios";
import {onMounted, ref} from "vue";

// export default {
//   name: "TestView"
// }
const name = ref('TestView');

onMounted(function (){
  getTest();
  console.log("클릭");
})
function getTest() {
  axios.get("/api/test").then(function (res){
    if (res.status === 200) {
      console.log("통신 성공");
      console.log(res);
    }
  })

}

</script>

<template>
<div>
  <h2>Test Component</h2>
</div>
</template>

<style scoped>

</style>
