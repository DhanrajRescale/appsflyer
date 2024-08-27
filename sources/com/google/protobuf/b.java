package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class b {
    protected int memoizedHashCode;

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(List list, y yVar) {
        Charset charset = z.f12003a;
        list.getClass();
        if (list instanceof c0) {
            List n10 = ((c0) list).n();
            c0 c0Var = (c0) yVar;
            int size = yVar.size();
            for (Object obj : n10) {
                if (obj == null) {
                    String str = "Element at index " + (c0Var.size() - size) + " is null.";
                    for (int size2 = c0Var.size() - 1; size2 >= size; size2--) {
                        c0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof h) {
                    c0Var.d((h) obj);
                } else {
                    c0Var.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof v0) {
            yVar.addAll(list);
            return;
        }
        if (yVar instanceof ArrayList) {
            ((ArrayList) yVar).ensureCapacity(list.size() + yVar.size());
        }
        int size3 = yVar.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                String str2 = "Element at index " + (yVar.size() - size3) + " is null.";
                for (int size4 = yVar.size() - 1; size4 >= size3; size4--) {
                    yVar.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            yVar.add(obj2);
        }
    }

    public abstract int h(z0 z0Var);

    public abstract void i(j jVar);
}
