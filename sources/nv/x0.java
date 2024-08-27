package nv;

import com.assetgro.stockgro.data.remote.NetworkService;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: b, reason: collision with root package name */
    public final Call.Factory f29315b;

    /* renamed from: c, reason: collision with root package name */
    public final HttpUrl f29316c;

    /* renamed from: d, reason: collision with root package name */
    public final List f29317d;

    /* renamed from: e, reason: collision with root package name */
    public final List f29318e;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f29314a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29319f = false;

    public x0(Call.Factory factory, HttpUrl httpUrl, List list, List list2) {
        this.f29315b = factory;
        this.f29316c = httpUrl;
        this.f29317d = list;
        this.f29318e = list2;
    }

    public final j a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f29318e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            j a10 = ((i) list.get(i10)).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((i) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final Object b() {
        if (NetworkService.class.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(NetworkService.class);
            while (!arrayDeque.isEmpty()) {
                Class cls = (Class) arrayDeque.removeFirst();
                if (cls.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls.getName());
                    if (cls != NetworkService.class) {
                        sb2.append(" which is an interface of ");
                        sb2.append(NetworkService.class.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls.getInterfaces());
            }
            if (this.f29319f) {
                q0 q0Var = q0.f29240c;
                for (Method method : NetworkService.class.getDeclaredMethods()) {
                    if ((!q0Var.f29241a || !method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
            }
            return Proxy.newProxyInstance(NetworkService.class.getClassLoader(), new Class[]{NetworkService.class}, new gl.j(this));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final y0 c(Method method) {
        y0 y0Var;
        y0 y0Var2 = (y0) this.f29314a.get(method);
        if (y0Var2 != null) {
            return y0Var2;
        }
        synchronized (this.f29314a) {
            try {
                y0Var = (y0) this.f29314a.get(method);
                if (y0Var == null) {
                    y0Var = y0.a(this, method);
                    this.f29314a.put(method, y0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y0Var;
    }

    public final o d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f29317d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            o a10 = ((n) list.get(i10)).a(type);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((n) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final o e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f29317d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i10 = indexOf; i10 < size; i10++) {
            o b10 = ((n) list.get(i10)).b(type, annotationArr, this);
            if (b10 != null) {
                return b10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((n) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f29317d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n) list.get(i10)).getClass();
        }
    }
}
