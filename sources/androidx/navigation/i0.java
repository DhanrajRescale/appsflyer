package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f2215c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2216a;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f2217b;

    public i0(Context context, w0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f2216a = context;
        this.f2217b = navigatorProvider;
    }

    public static k c(TypedArray typedArray, Resources resources, int i10) {
        TypedValue typedValue;
        s0 s0Var;
        s0 type;
        boolean z10;
        s0 s0Var2;
        s0 s0Var3;
        Object obj;
        s0 s0Var4;
        boolean z11;
        int i11;
        String str;
        boolean z12 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f2215c;
        TypedValue typedValue2 = (TypedValue) threadLocal.get();
        if (typedValue2 == null) {
            typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
        }
        String string = typedArray.getString(2);
        s0 s0Var5 = s0.f2293c;
        s0 s0Var6 = s0.f2298h;
        s0 s0Var7 = s0.f2302l;
        s0 s0Var8 = s0.f2300j;
        s0 s0Var9 = s0.f2296f;
        s0 s0Var10 = s0.f2294d;
        s0 s0Var11 = s0.f2295e;
        s0 s0Var12 = s0.f2301k;
        m0 m0Var = s0.f2299i;
        m0 m0Var2 = s0.f2297g;
        m0 m0Var3 = s0.f2292b;
        s0 s0Var13 = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i10);
            typedValue = typedValue2;
            if (Intrinsics.a(m0Var3.b(), string)) {
                type = m0Var3;
            } else if (Intrinsics.a(s0Var10.b(), string)) {
                s0Var = s0Var6;
                type = s0Var10;
            } else if (Intrinsics.a(s0Var11.b(), string)) {
                s0Var = s0Var6;
                type = s0Var11;
            } else if (Intrinsics.a(s0Var9.b(), string)) {
                s0Var = s0Var6;
                type = s0Var9;
            } else if (Intrinsics.a(m0Var.b(), string)) {
                s0Var = s0Var6;
                type = m0Var;
            } else if (Intrinsics.a(s0Var8.b(), string)) {
                s0Var = s0Var6;
                type = s0Var8;
            } else {
                if (!Intrinsics.a(s0Var12.b(), string)) {
                    if (Intrinsics.a(s0Var7.b(), string)) {
                        s0Var = s0Var6;
                        type = s0Var7;
                    } else if (Intrinsics.a(m0Var2.b(), string)) {
                        type = m0Var2;
                    } else if (Intrinsics.a(s0Var6.b(), string)) {
                        type = s0Var6;
                        s0Var = type;
                    } else if (Intrinsics.a(s0Var5.b(), string)) {
                        type = s0Var5;
                    } else if (string.length() != 0) {
                        try {
                            s0Var = s0Var6;
                            if (kotlin.text.s.r(string, ".", false) && resourcePackageName != null) {
                                str = resourcePackageName.concat(string);
                            } else {
                                str = string;
                            }
                            if (kotlin.text.s.i(string, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false)) {
                                str = str.substring(0, str.length() - 2);
                                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                                Class<?> cls = Class.forName(str);
                                if (Parcelable.class.isAssignableFrom(cls)) {
                                    type = new o0(cls);
                                } else {
                                    if (Serializable.class.isAssignableFrom(cls)) {
                                        type = new q0(cls);
                                    }
                                    throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                }
                            } else {
                                Class<?> cls2 = Class.forName(str);
                                if (Parcelable.class.isAssignableFrom(cls2)) {
                                    type = new p0(cls2);
                                } else if (Enum.class.isAssignableFrom(cls2)) {
                                    type = new n0(cls2);
                                } else {
                                    if (Serializable.class.isAssignableFrom(cls2)) {
                                        type = new r0(cls2);
                                    }
                                    throw new IllegalArgumentException(str + " is not Serializable or Parcelable.");
                                }
                            }
                        } catch (ClassNotFoundException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                }
                s0Var = s0Var6;
                type = s0Var12;
            }
            s0Var = s0Var6;
        } else {
            typedValue = typedValue2;
            s0Var = s0Var6;
            type = null;
        }
        TypedValue typedValue3 = typedValue;
        if (typedArray.getValue(1, typedValue3)) {
            s0Var2 = s0Var8;
            s0Var3 = s0Var9;
            if (type == s0Var5) {
                int i12 = typedValue3.resourceId;
                if (i12 != 0) {
                    i11 = i12;
                } else if (typedValue3.type == 16 && typedValue3.data == 0) {
                    i11 = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue3.string) + "' for " + type.b() + ". Must be a reference to a resource.");
                }
                obj = Integer.valueOf(i11);
            } else {
                int i13 = typedValue3.resourceId;
                if (i13 != 0) {
                    if (type == null) {
                        obj = Integer.valueOf(i13);
                        type = s0Var5;
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue3.string) + "' for " + type.b() + ". You must use a \"" + s0Var5.b() + "\" type to reference other resources.");
                    }
                } else if (type == s0Var12) {
                    z10 = true;
                    obj = typedArray.getString(1);
                } else {
                    z10 = true;
                    int i14 = typedValue3.type;
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 5) {
                                if (i14 != 18) {
                                    if (i14 >= 16 && i14 <= 31) {
                                        if (type == m0Var2) {
                                            type = mt.p.p(typedValue3, type, m0Var2, string, "float");
                                            obj = Float.valueOf(typedValue3.data);
                                        } else {
                                            type = mt.p.p(typedValue3, type, m0Var3, string, "integer");
                                            obj = Integer.valueOf(typedValue3.data);
                                        }
                                    } else {
                                        throw new XmlPullParserException("unsupported argument type " + typedValue3.type);
                                    }
                                } else {
                                    type = mt.p.p(typedValue3, type, m0Var, string, "boolean");
                                    if (typedValue3.data != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    obj = Boolean.valueOf(z11);
                                }
                            } else {
                                type = mt.p.p(typedValue3, type, m0Var3, string, "dimension");
                                obj = Integer.valueOf((int) typedValue3.getDimension(resources.getDisplayMetrics()));
                            }
                        } else {
                            type = mt.p.p(typedValue3, type, m0Var2, string, "float");
                            obj = Float.valueOf(typedValue3.getFloat());
                        }
                    } else {
                        String value = typedValue3.string.toString();
                        if (type == null) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            try {
                                try {
                                    try {
                                        try {
                                            m0Var3.c(value);
                                            type = m0Var3;
                                        } catch (IllegalArgumentException unused) {
                                            m0Var.c(value);
                                            type = m0Var;
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        s0Var11.c(value);
                                        type = s0Var11;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    type = s0Var12;
                                }
                            } catch (IllegalArgumentException unused4) {
                                m0Var2.c(value);
                                type = m0Var2;
                            }
                        }
                        obj = type.c(value);
                    }
                }
            }
            z10 = true;
        } else {
            z10 = true;
            s0Var2 = s0Var8;
            s0Var3 = s0Var9;
            obj = null;
        }
        if (obj == null) {
            obj = null;
            z10 = false;
        }
        if (type != null) {
            Intrinsics.checkNotNullParameter(type, "type");
            s0Var13 = type;
        }
        if (s0Var13 == null) {
            if (obj instanceof Integer) {
                s0Var4 = m0Var3;
            } else if (obj instanceof int[]) {
                s0Var4 = s0Var10;
            } else if (obj instanceof Long) {
                s0Var4 = s0Var11;
            } else if (obj instanceof long[]) {
                s0Var4 = s0Var3;
            } else if (obj instanceof Float) {
                s0Var4 = m0Var2;
            } else if (obj instanceof float[]) {
                s0Var4 = s0Var;
            } else if (obj instanceof Boolean) {
                s0Var4 = m0Var;
            } else if (obj instanceof boolean[]) {
                s0Var4 = s0Var2;
            } else if (!(obj instanceof String) && obj != null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    s0Var4 = s0Var7;
                } else {
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        Intrinsics.c(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            Intrinsics.d(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            s0Var4 = new o0(componentType2);
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        Intrinsics.c(componentType3);
                        if (Serializable.class.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            Intrinsics.d(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            s0Var4 = new q0(componentType4);
                        }
                    }
                    if (obj instanceof Parcelable) {
                        s0Var4 = new p0(obj.getClass());
                    } else if (obj instanceof Enum) {
                        s0Var4 = new n0(obj.getClass());
                    } else if (obj instanceof Serializable) {
                        s0Var4 = new r0(obj.getClass());
                    } else {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                }
            } else {
                s0Var4 = s0Var12;
            }
        } else {
            s0Var4 = s0Var13;
        }
        return new k(s0Var4, z12, obj, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x012e, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x020a, code lost:
    
        if (r6.isEmpty() != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x020c, code lost:
    
        r5.f2210c = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x020e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "action");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0215, code lost:
    
        if ((!(r4 instanceof androidx.navigation.b)) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0217, code lost:
    
        if (r19 == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0219, code lost:
    
        r4.f2179f.g(r19, r5);
        r8.recycle();
        r0 = r28;
        r7 = 1;
        r5 = r16;
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0239, code lost:
    
        throw new java.lang.IllegalArgumentException("Cannot have an action with actionId 0".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x025c, code lost:
    
        throw new java.lang.UnsupportedOperationException("Cannot add action " + r19 + " to " + r4 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x02a7, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.navigation.c0 a(android.content.res.Resources r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.i0.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):androidx.navigation.c0");
    }

    public final f0 b(int i10) {
        int next;
        Resources res = this.f2216a.getResources();
        XmlResourceParser xml = res.getXml(i10);
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i10) + " line " + xml.getLineNumber(), e10);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            Intrinsics.checkNotNullExpressionValue(res, "res");
            Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
            c0 a10 = a(res, xml, attrs, i10);
            if (a10 instanceof f0) {
                return (f0) a10;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
