package nv;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* loaded from: classes2.dex */
public final class d0 extends n {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f29196a = new Object();

    @Override // nv.n
    public final o b(Type type, Annotation[] annotationArr, x0 x0Var) {
        if (e1.e(type) != Optional.class) {
            return null;
        }
        return new ek.h0(x0Var.e(e1.d(0, (ParameterizedType) type), annotationArr), 25);
    }
}
