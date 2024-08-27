package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.j0;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class m implements s {

    /* renamed from: a, reason: collision with root package name */
    Context f12281a;

    public m(Context context) {
        this.f12281a = context;
    }

    @Override // com.webengage.sdk.android.actions.database.s
    public boolean a(com.webengage.sdk.android.n nVar) {
        ArrayList<com.webengage.sdk.android.n> arrayList = new ArrayList<>();
        arrayList.add(nVar);
        return a(arrayList);
    }

    public boolean a(ArrayList<com.webengage.sdk.android.n> arrayList) {
        WebEngage.startService(com.webengage.sdk.android.q.a(j0.f12601e, arrayList, this.f12281a), this.f12281a);
        return true;
    }
}
