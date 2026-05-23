const CACHE_NAME = "portfolio-v1";

self.addEventListener("install", event => {
    console.log("SW installed");
    self.skipWaiting();
});

self.addEventListener("activate", event => {
    console.log("SW activated");
    return self.clients.claim();
});

self.addEventListener("fetch", event => {
    event.respondWith(fetch(event.request));
});