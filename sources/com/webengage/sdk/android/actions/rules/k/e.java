package com.webengage.sdk.android.actions.rules.k;

import com.google.android.gms.common.api.Api;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private String f12514a;

    /* renamed from: b, reason: collision with root package name */
    private int f12515b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public e(String str) {
        this.f12514a = str;
    }

    public abstract Object a(List<Object> list);

    public String a() {
        return this.f12514a;
    }
}
