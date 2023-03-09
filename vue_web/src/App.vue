<template>
  <div>
    <div>BotName:{{ bot_name }}</div>
    <div>BotPower:{{ bot_power }}</div>
  </div>
  <router-view></router-view>
</template>

<script>
import $ from 'jquery';
import { ref } from 'vue';
export default {
  name: "App",
  setup: () => {
    let bot_name = ref("");
    let bot_power = ref("");
    $.ajax({
      url: "http://localhost:2333/pk/bot/",
      type: "get",
      success: resp => {
        bot_name.value = resp.name;
        bot_power.value = resp.power;
      }
    });
    return {
      bot_name,
      bot_power
    }
  }
}
</script>

<style></style>
