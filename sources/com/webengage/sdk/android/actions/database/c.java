package com.webengage.sdk.android.actions.database;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class c implements s {

    /* renamed from: a, reason: collision with root package name */
    private e f12246a;

    /* renamed from: b, reason: collision with root package name */
    private j f12247b;

    public c(e eVar, j jVar) {
        this.f12246a = eVar;
        this.f12247b = jVar;
    }

    @Override // com.webengage.sdk.android.actions.database.s
    public boolean a(com.webengage.sdk.android.n nVar) {
        ArrayList<com.webengage.sdk.android.n> arrayList = new ArrayList<>();
        arrayList.add(nVar);
        return a(arrayList);
    }

    public boolean a(ArrayList<com.webengage.sdk.android.n> arrayList) {
        return this.f12246a.a(arrayList) && this.f12247b.a(arrayList);
    }
}
