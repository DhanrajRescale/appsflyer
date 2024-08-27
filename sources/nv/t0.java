package nv;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.MediaType;

/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f29261x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f29262y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a, reason: collision with root package name */
    public final x0 f29263a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f29264b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation[] f29265c;

    /* renamed from: d, reason: collision with root package name */
    public final Annotation[][] f29266d;

    /* renamed from: e, reason: collision with root package name */
    public final Type[] f29267e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29268f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29269g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29270h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29271i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29272j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f29273k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f29274l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29275m;

    /* renamed from: n, reason: collision with root package name */
    public String f29276n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29277o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29278p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29279q;

    /* renamed from: r, reason: collision with root package name */
    public String f29280r;

    /* renamed from: s, reason: collision with root package name */
    public Headers f29281s;

    /* renamed from: t, reason: collision with root package name */
    public MediaType f29282t;

    /* renamed from: u, reason: collision with root package name */
    public LinkedHashSet f29283u;

    /* renamed from: v, reason: collision with root package name */
    public bl.j[] f29284v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f29285w;

    public t0(x0 x0Var, Method method) {
        this.f29263a = x0Var;
        this.f29264b = method;
        this.f29265c = method.getAnnotations();
        this.f29267e = method.getGenericParameterTypes();
        this.f29266d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z10) {
        String str3 = this.f29276n;
        Method method = this.f29264b;
        if (str3 == null) {
            this.f29276n = str;
            this.f29277o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            Pattern pattern = f29261x;
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw e1.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f29280r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f29283u = linkedHashSet;
            return;
        }
        throw e1.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }

    public final void c(int i10, Type type) {
        if (!e1.g(type)) {
            return;
        }
        throw e1.j(this.f29264b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
    }
}
