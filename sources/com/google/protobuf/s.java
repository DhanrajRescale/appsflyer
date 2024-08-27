package com.google.protobuf;

/* loaded from: classes2.dex */
public final class s implements u0 {
    static {
        if (l.f11942a == null) {
            synchronized (l.class) {
                try {
                    if (l.f11942a == null) {
                        Class cls = k.f11938a;
                        l lVar = null;
                        if (cls != null) {
                            try {
                                lVar = (l) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                            } catch (Exception unused) {
                            }
                        }
                        if (lVar == null) {
                            lVar = l.f11943b;
                        }
                        l.f11942a = lVar;
                    }
                } finally {
                }
            }
        }
    }
}
