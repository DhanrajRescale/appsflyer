package com.webengage.sdk.android;

import android.content.Context;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    static User f12633a;

    /* renamed from: b, reason: collision with root package name */
    static User f12634b;

    /* renamed from: c, reason: collision with root package name */
    static User f12635c;

    public static User a() {
        if (f12634b == null) {
            f12634b = new p0();
        }
        return f12634b;
    }

    public static User a(Context context, Analytics analytics) {
        if (f12633a == null) {
            f12633a = new o0(context.getApplicationContext(), analytics);
        }
        return f12633a;
    }

    public static User a(Queue<i0> queue) {
        if (f12635c == null) {
            f12635c = new b0(queue);
        }
        return f12635c;
    }
}
