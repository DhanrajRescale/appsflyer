package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
class e implements s {

    /* renamed from: a, reason: collision with root package name */
    Context f12251a;

    public e(Context context) {
        this.f12251a = context;
    }

    public int a() {
        return i.b(this.f12251a).d();
    }

    public ArrayList<com.webengage.sdk.android.n> a(int i10) {
        return i.b(this.f12251a).a(i10);
    }

    @Override // com.webengage.sdk.android.actions.database.s
    public boolean a(com.webengage.sdk.android.n nVar) {
        if (nVar == null) {
            return false;
        }
        i.b(this.f12251a).a(nVar);
        if (!nVar.b().equals("application")) {
            return true;
        }
        Logger.d("WebEngage", "Event : " + nVar.d() + " successfully Logged");
        return true;
    }

    public boolean a(ArrayList<com.webengage.sdk.android.n> arrayList) {
        if (arrayList == null) {
            return true;
        }
        Iterator<com.webengage.sdk.android.n> it = arrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return true;
    }
}
