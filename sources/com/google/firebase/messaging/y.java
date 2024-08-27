package com.google.firebase.messaging;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f11803b;

    /* renamed from: a, reason: collision with root package name */
    public u f11804a;

    public final synchronized x a() {
        String str;
        x xVar;
        u uVar = this.f11804a;
        synchronized (((ArrayDeque) uVar.f11790e)) {
            str = (String) ((ArrayDeque) uVar.f11790e).peek();
        }
        Pattern pattern = x.f11799d;
        xVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                xVar = new x(split[0], split[1]);
            }
        }
        return xVar;
    }
}
