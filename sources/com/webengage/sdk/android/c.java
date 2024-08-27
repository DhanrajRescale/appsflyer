package com.webengage.sdk.android;

import android.content.Context;
import java.util.Queue;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    static Analytics f12533a;

    /* renamed from: b, reason: collision with root package name */
    static Analytics f12534b;

    /* renamed from: c, reason: collision with root package name */
    static Analytics f12535c;

    public static Analytics a() {
        if (f12534b == null) {
            f12534b = new e();
        }
        return f12534b;
    }

    public static Analytics a(Context context) {
        if (f12533a == null) {
            f fVar = new f(context.getApplicationContext());
            f12533a = new d(context, fVar, new e0(fVar, context.getApplicationContext()), new d0(context.getApplicationContext()));
        }
        return f12533a;
    }

    public static Analytics a(Queue<i0> queue) {
        if (f12535c == null) {
            f12535c = new a0(queue);
        }
        return f12535c;
    }
}
