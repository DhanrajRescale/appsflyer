package com.webengage.sdk.android.utils.htmlspanner.i;

import com.webengage.sdk.android.utils.htmlspanner.c;
import com.webengage.sdk.android.utils.htmlspanner.i.a;
import dv.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private List<List<a.a0>> f12792a;

    /* renamed from: b, reason: collision with root package name */
    private List<a.y> f12793b;

    /* renamed from: c, reason: collision with root package name */
    private c f12794c;

    /* renamed from: d, reason: collision with root package name */
    private String f12795d;

    public b(c cVar, List<List<a.a0>> list, List<a.y> list2, String str) {
        this.f12792a = new ArrayList();
        new ArrayList();
        this.f12794c = cVar;
        this.f12792a = list;
        this.f12793b = list2;
        this.f12795d = str;
    }

    public com.webengage.sdk.android.utils.htmlspanner.n.a a(com.webengage.sdk.android.utils.htmlspanner.n.a aVar) {
        Iterator<a.y> it = this.f12793b.iterator();
        while (it.hasNext()) {
            aVar = it.next().a(aVar, this.f12794c);
        }
        return aVar;
    }

    public String toString() {
        return this.f12795d;
    }

    public boolean a(s sVar) {
        Iterator<List<a.a0>> it = this.f12792a.iterator();
        while (it.hasNext()) {
            if (a(it.next(), sVar)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(List<a.a0> list, s sVar) {
        Iterator<a.a0> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().a(sVar)) {
                return false;
            }
            sVar = sVar.a();
        }
        return true;
    }
}
