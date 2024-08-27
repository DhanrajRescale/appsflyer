package com.webengage.sdk.android.utils.htmlspanner.j;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private List<f> f12824a;

    /* renamed from: b, reason: collision with root package name */
    private List<d> f12825b;

    public e() {
        this(new ArrayList());
    }

    private String a(List<f> list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public List<f> b() {
        return this.f12824a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a(this.f12824a) + " {\n");
        Iterator<d> it = this.f12825b.iterator();
        while (it.hasNext()) {
            sb2.append("\t" + it.next() + ";\n");
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    public e(List<f> list) {
        this.f12824a = list;
        this.f12825b = new ArrayList();
    }

    public List<d> a() {
        return this.f12825b;
    }

    public void a(d dVar) {
        this.f12825b.add(dVar);
    }

    public void a(f fVar) {
        this.f12824a.add(fVar);
    }
}
