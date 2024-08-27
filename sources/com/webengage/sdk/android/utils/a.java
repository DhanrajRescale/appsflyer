package com.webengage.sdk.android.utils;

/* loaded from: classes2.dex */
public class a {

    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Object f12718a;

        private b(Object obj) {
            this.f12718a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object obj = this.f12718a;
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                } else if (obj instanceof com.webengage.sdk.android.utils.l.f) {
                    com.webengage.sdk.android.utils.l.g a10 = ((com.webengage.sdk.android.utils.l.f) obj).a();
                    if (a10.n()) {
                        a10.b();
                    } else {
                        a10.a();
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Object obj) {
        k.a().a(new b(obj));
    }
}
