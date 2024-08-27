package nv;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class q extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f29239a;

    public q(Executor executor) {
        this.f29239a = executor;
    }

    @Override // nv.i
    public final j a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (e1.e(type) != h.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d10 = e1.d(0, (ParameterizedType) type);
            if (!e1.h(annotationArr, z0.class)) {
                executor = this.f29239a;
            }
            return new x9.c(this, d10, executor, 16);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
