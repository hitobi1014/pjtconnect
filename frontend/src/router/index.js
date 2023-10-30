import {createWebHistory, createRouter} from "vue-router";
import HelloWorld from "@/components/HelloWorld.vue";
import TestView from "@/components/TestView.vue";

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: "/",
            name: "Test",
            component: TestView,
        }
    ]
})

export default router;