package nv;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* loaded from: classes2.dex */
public final class m extends i {

    /* renamed from: a, reason: collision with root package name */
    public static final m f29233a = new Object();

    @Override // nv.i
    public final j a(Type type, Annotation[] annotationArr) {
        if (e1.e(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type d10 = e1.d(0, (ParameterizedType) type);
            if (e1.e(d10) != v0.class) {
                return new ek.u(d10, 22);
            }
            if (d10 instanceof ParameterizedType) {
                return new ll.o(e1.d(0, (ParameterizedType) d10), 22);
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
