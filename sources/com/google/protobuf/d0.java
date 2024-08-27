package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class d0 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f11900c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // com.google.protobuf.f0
    public final void a(long j10, Object obj) {
        Object unmodifiableList;
        List list = (List) r1.f11981c.i(j10, obj);
        if (list instanceof c0) {
            unmodifiableList = ((c0) list).x();
        } else {
            if (f11900c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof v0) && (list instanceof y)) {
                c cVar = (c) ((y) list);
                if (cVar.f11897a) {
                    cVar.f11897a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        r1.r(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.f0
    public final void b(Object obj, long j10, Object obj2) {
        b0 b0Var;
        q1 q1Var = r1.f11981c;
        List list = (List) q1Var.i(j10, obj2);
        int size = list.size();
        List list2 = (List) q1Var.i(j10, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof c0) {
                list2 = new b0(size);
            } else if ((list2 instanceof v0) && (list2 instanceof y)) {
                list2 = ((y) list2).f(size);
            } else {
                list2 = new ArrayList(size);
            }
            r1.r(obj, j10, list2);
        } else {
            if (f11900c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                r1.r(obj, j10, arrayList);
                b0Var = arrayList;
            } else if (list2 instanceof m1) {
                b0 b0Var2 = new b0(list2.size() + size);
                b0Var2.addAll((m1) list2);
                r1.r(obj, j10, b0Var2);
                b0Var = b0Var2;
            } else if ((list2 instanceof v0) && (list2 instanceof y)) {
                y yVar = (y) list2;
                if (!((c) yVar).f11897a) {
                    list2 = yVar.f(list2.size() + size);
                    r1.r(obj, j10, list2);
                }
            }
            list2 = b0Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        r1.r(obj, j10, list);
    }
}
