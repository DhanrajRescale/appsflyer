package tr;

import at.m;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import mt.p;
import nv.e1;
import nv.i;
import nv.j;
import nv.v0;

/* loaded from: classes2.dex */
public final class h extends i {
    @Override // nv.i
    public final j a(Type type, Annotation[] annotationArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        Type type2;
        boolean z13;
        boolean z14;
        String str;
        Class e10 = e1.e(type);
        if (e10 == at.a.class) {
            return new g(Void.class, false, true, false, false, false, true);
        }
        if (e10 == at.c.class) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (e10 == m.class) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (e10 == p.class) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (e10 != at.e.class && !z10 && !z11 && !z12) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (!z10) {
                if (z11) {
                    str = "Single";
                } else {
                    str = "Observable";
                }
            } else {
                str = "Flowable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type d10 = e1.d(0, (ParameterizedType) type);
        Class e11 = e1.e(d10);
        if (e11 == v0.class) {
            if (d10 instanceof ParameterizedType) {
                type2 = e1.d(0, (ParameterizedType) d10);
                z14 = false;
                z13 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (e11 == e.class) {
            if (d10 instanceof ParameterizedType) {
                type2 = e1.d(0, (ParameterizedType) d10);
                z14 = true;
                z13 = false;
            } else {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
        } else {
            type2 = d10;
            z13 = true;
            z14 = false;
        }
        return new g(type2, z14, z13, z10, z11, z12, false);
    }
}
