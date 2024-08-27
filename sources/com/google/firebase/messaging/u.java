package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11786a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11787b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f11788c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11789d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11790e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11791f;

    public u() {
        this.f11787b = new ArrayList();
        this.f11788c = new ArrayList();
        JSONArray jSONArray = ls.m.f25237f;
        this.f11789d = jSONArray;
        this.f11790e = jSONArray;
        this.f11786a = false;
    }

    public static u a(SharedPreferences sharedPreferences, Executor executor) {
        u uVar = new u(sharedPreferences, executor);
        synchronized (((ArrayDeque) uVar.f11790e)) {
            try {
                ((ArrayDeque) uVar.f11790e).clear();
                String string = ((SharedPreferences) uVar.f11787b).getString((String) uVar.f11788c, HttpUrl.FRAGMENT_ENCODE_SET);
                if (!TextUtils.isEmpty(string) && string.contains((String) uVar.f11789d)) {
                    String[] split = string.split((String) uVar.f11789d, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) uVar.f11790e).add(str);
                        }
                    }
                }
            } finally {
            }
        }
        return uVar;
    }

    public final boolean b(String str) {
        boolean remove;
        synchronized (((ArrayDeque) this.f11790e)) {
            remove = ((ArrayDeque) this.f11790e).remove(str);
            if (remove && !this.f11786a) {
                ((Executor) this.f11791f).execute(new bl.d(this, 16));
            }
        }
        return remove;
    }

    public u(SharedPreferences sharedPreferences, Executor executor) {
        this.f11790e = new ArrayDeque();
        this.f11786a = false;
        this.f11787b = sharedPreferences;
        this.f11788c = "topic_operation_queue";
        this.f11789d = ",";
        this.f11791f = executor;
    }
}
