package com.webengage.sdk.android.actions.rules.k;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f12492a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, com.webengage.sdk.android.actions.rules.k.g> f12493b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, com.webengage.sdk.android.actions.rules.k.e> f12494c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, com.webengage.sdk.android.actions.rules.k.h> f12495d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private com.webengage.sdk.android.actions.rules.k.a f12496e = new com.webengage.sdk.android.actions.rules.k.b();

    /* loaded from: classes2.dex */
    public class a extends com.webengage.sdk.android.actions.rules.k.g {
        public a(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            return Boolean.valueOf(!((Boolean) c.a().b("==").a(obj, obj2)).booleanValue());
        }
    }

    /* loaded from: classes2.dex */
    public class b extends com.webengage.sdk.android.actions.rules.k.g {
        public b(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return null;
            }
            if (obj == null) {
                if (obj2 instanceof String) {
                    return obj2.toString();
                }
                return null;
            }
            if (obj2 == null) {
                if (obj instanceof String) {
                    return obj.toString();
                }
                return null;
            }
            if ((obj instanceof Number) && (obj2 instanceof Number)) {
                return Double.valueOf(((Number) obj2).doubleValue() + ((Number) obj).doubleValue());
            }
            return obj.toString() + obj2.toString();
        }
    }

    /* renamed from: com.webengage.sdk.android.actions.rules.k.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0005c extends com.webengage.sdk.android.actions.rules.k.g {
        public C0005c(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return null;
            }
            return Double.valueOf(((Number) obj).doubleValue() - ((Number) obj2).doubleValue());
        }
    }

    /* loaded from: classes2.dex */
    public class d extends com.webengage.sdk.android.actions.rules.k.g {
        public d(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return null;
            }
            return Double.valueOf(((Number) obj2).doubleValue() * ((Number) obj).doubleValue());
        }
    }

    /* loaded from: classes2.dex */
    public class e extends com.webengage.sdk.android.actions.rules.k.g {
        public e(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return null;
            }
            return Double.valueOf(((Number) obj).doubleValue() / ((Number) obj2).doubleValue());
        }
    }

    /* loaded from: classes2.dex */
    public class f extends com.webengage.sdk.android.actions.rules.k.g {
        public f(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return null;
            }
            return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
        }
    }

    /* loaded from: classes2.dex */
    public class g extends com.webengage.sdk.android.actions.rules.k.e {
        public g(String str) {
            super(str);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.e
        public Object a(List<Object> list) {
            return (list.size() == 0 || list.get(0) == null) ? Boolean.FALSE : Boolean.valueOf(!((Boolean) list.get(0)).booleanValue());
        }
    }

    /* loaded from: classes2.dex */
    public class h extends com.webengage.sdk.android.actions.rules.k.g {
        public h(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            ArrayList arrayList = new ArrayList();
            if (obj instanceof Collection) {
                arrayList.addAll((Collection) obj);
            } else {
                arrayList.add(obj);
            }
            if (obj2 instanceof Collection) {
                arrayList.addAll((Collection) obj2);
            } else {
                arrayList.add(obj2);
            }
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public class i extends com.webengage.sdk.android.actions.rules.k.g {
        public i(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) >= 0);
        }
    }

    /* loaded from: classes2.dex */
    public class j extends com.webengage.sdk.android.actions.rules.k.g {
        public j(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) <= 0);
        }
    }

    /* loaded from: classes2.dex */
    public class k extends com.webengage.sdk.android.actions.rules.k.g {
        public k(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) > 0);
        }
    }

    /* loaded from: classes2.dex */
    public class l extends com.webengage.sdk.android.actions.rules.k.g {
        public l(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) < 0);
        }
    }

    /* loaded from: classes2.dex */
    public class m extends com.webengage.sdk.android.actions.rules.k.g {
        public m(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            if (obj.getClass().getSimpleName().equalsIgnoreCase(obj2.getClass().getSimpleName())) {
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes2.dex */
    public class n extends com.webengage.sdk.android.actions.rules.k.g {
        public n(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            if (obj.getClass().getSimpleName().equalsIgnoreCase(obj2.getClass().getSimpleName())) {
                return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes2.dex */
    public class o extends com.webengage.sdk.android.actions.rules.k.g {
        public o(String str, int i10) {
            super(str, i10);
        }

        @Override // com.webengage.sdk.android.actions.rules.k.g
        public Object a(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return Boolean.TRUE;
            }
            if (obj == null || obj2 == null) {
                return Boolean.FALSE;
            }
            if ((obj instanceof Number) && (obj2 instanceof Number)) {
                return Boolean.valueOf(Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) == 0);
            }
            return !obj.getClass().getSimpleName().equals(obj2.getClass().getSimpleName()) ? Boolean.FALSE : Boolean.valueOf(obj.toString().equals(obj2.toString()));
        }
    }

    private c() {
        b();
    }

    public static c a() {
        if (f12492a == null) {
            synchronized (c.class) {
                try {
                    if (f12492a == null) {
                        f12492a = new c();
                    }
                } finally {
                }
            }
        }
        return f12492a;
    }

    public com.webengage.sdk.android.actions.rules.k.g b(String str) {
        com.webengage.sdk.android.actions.rules.k.g gVar;
        synchronized (this.f12493b) {
            gVar = this.f12493b.get(str);
        }
        return gVar;
    }

    public boolean c(String str) {
        boolean containsKey;
        synchronized (this.f12494c) {
            containsKey = this.f12494c.containsKey(str);
        }
        return containsKey;
    }

    public boolean d(String str) {
        boolean containsKey;
        synchronized (this.f12493b) {
            containsKey = this.f12493b.containsKey(str);
        }
        return containsKey;
    }

    public boolean e(String str) {
        return a().d(str) || a().c(str) || a().f(str) || str.equals("[") || str.equals("]") || str.equals("(") || str.equals(")");
    }

    public boolean f(String str) {
        boolean containsKey;
        synchronized (this.f12495d) {
            containsKey = this.f12495d.containsKey(str);
        }
        return containsKey;
    }

    public String g(String str) {
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\\') {
                i10++;
            } else {
                i10 >>= 1;
                while (i10 != 0) {
                    str2 = jr.h.r(str2, "\\");
                    i10--;
                }
                str2 = str2 + charAt;
            }
        }
        for (int i12 = i10 >> 1; i12 != 0; i12--) {
            str2 = jr.h.r(str2, "\\");
        }
        return str2;
    }

    private void b() {
        a(new g("!"));
        a(new h(",", Integer.MIN_VALUE));
        a(new i(">=", 100));
        a(new j("<=", 100));
        a(new k(UrlTreeKt.configurablePathSegmentSuffix, 100));
        a(new l(UrlTreeKt.configurablePathSegmentPrefix, 100));
        a(new m("&&", 10));
        a(new n("||", 9));
        a(new o("==", 100));
        a(new a("!=", 100));
        a(new b("+", 101));
        a(new C0005c("-", 101));
        a(new d("*", 102));
        a(new e("/", 102));
        a(new f("^", 103));
    }

    public com.webengage.sdk.android.actions.rules.k.e a(String str) {
        com.webengage.sdk.android.actions.rules.k.e eVar;
        synchronized (this.f12494c) {
            eVar = this.f12494c.get(str);
        }
        return eVar;
    }

    public Object a(List<String> list, boolean z10) {
        Object a10;
        if (list == null) {
            return null;
        }
        Stack stack = new Stack();
        for (String str : list) {
            if (!str.equalsIgnoreCase(" ") && !str.isEmpty()) {
                if (f(str)) {
                    a10 = this.f12495d.get(str).a();
                } else if (d(str)) {
                    Object pop = stack.pop();
                    a10 = this.f12493b.get(str).a(stack.pop(), pop);
                } else if (c(str)) {
                    Object pop2 = stack.pop();
                    if (pop2 instanceof List) {
                        a10 = this.f12494c.get(str).a((List) pop2);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(pop2);
                        a10 = this.f12494c.get(str).a(arrayList);
                    }
                } else {
                    com.webengage.sdk.android.actions.rules.k.a aVar = this.f12496e;
                    if (z10) {
                        str = g(str);
                    }
                    a10 = aVar.a(str);
                }
                stack.push(a10);
            }
        }
        return stack.pop();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009a -> B:35:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.String> a(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            if (r7 == 0) goto Lf9
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto La
            goto Lf9
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.webengage.sdk.android.actions.rules.k.f r1 = new com.webengage.sdk.android.actions.rules.k.f
            r1.<init>(r7, r8)
            java.util.ArrayDeque r7 = new java.util.ArrayDeque
            r7.<init>()
            java.lang.String r8 = ""
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le8
            java.lang.String r2 = r1.next()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L2c
            goto L1b
        L2c:
            boolean r3 = r6.d(r2)
            if (r3 != 0) goto Lc6
            boolean r3 = r6.c(r2)
            if (r3 == 0) goto L3a
            goto Lc6
        L3a:
            java.lang.String r3 = "("
            boolean r4 = r2.equalsIgnoreCase(r3)
            if (r4 != 0) goto Le2
            java.lang.String r4 = "["
            boolean r5 = r2.equalsIgnoreCase(r4)
            if (r5 == 0) goto L4c
            goto Le2
        L4c:
            java.lang.String r5 = ")"
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 != 0) goto L6b
            java.lang.String r5 = "]"
            boolean r5 = r2.equalsIgnoreCase(r5)
            if (r5 == 0) goto L5d
            goto L6b
        L5d:
            java.lang.String r8 = r2.trim()
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L1b
            r0.add(r8)
            goto L1b
        L6b:
            boolean r5 = r8.equalsIgnoreCase(r3)
            if (r5 != 0) goto L77
            boolean r8 = r8.equalsIgnoreCase(r4)
            if (r8 == 0) goto L7c
        L77:
            java.lang.String r8 = "null"
        L79:
            r0.add(r8)
        L7c:
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto La1
            java.lang.Object r8 = r7.peek()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equalsIgnoreCase(r3)
            if (r8 != 0) goto La1
            java.lang.Object r8 = r7.peek()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equalsIgnoreCase(r4)
            if (r8 != 0) goto La1
            java.lang.Object r8 = r7.pop()
            java.lang.String r8 = (java.lang.String) r8
            goto L79
        La1:
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto Laa
            r7.pop()
        Laa:
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto Le5
            java.lang.Object r8 = r7.peek()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r6.c(r8)
            if (r8 == 0) goto Le5
            java.lang.Object r8 = r7.pop()
            java.lang.String r8 = (java.lang.String) r8
            r0.add(r8)
            goto Le5
        Lc6:
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto Le2
            java.lang.Object r8 = r7.peek()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r6.a(r2, r8)
            if (r8 == 0) goto Le2
            java.lang.Object r8 = r7.pop()
            java.lang.String r8 = (java.lang.String) r8
            r0.add(r8)
            goto Lc6
        Le2:
            r7.push(r2)
        Le5:
            r8 = r2
            goto L1b
        Le8:
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto Lf8
            java.lang.Object r8 = r7.pop()
            java.lang.String r8 = (java.lang.String) r8
            r0.add(r8)
            goto Le8
        Lf8:
            return r0
        Lf9:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.rules.k.c.a(java.lang.String, boolean):java.util.List");
    }

    public void a(com.webengage.sdk.android.actions.rules.k.e eVar) {
        synchronized (this.f12494c) {
            this.f12494c.put(eVar.a(), eVar);
        }
    }

    public void a(com.webengage.sdk.android.actions.rules.k.g gVar) {
        synchronized (this.f12493b) {
            this.f12493b.put(gVar.a(), gVar);
        }
    }

    public boolean a(String str, String str2) {
        if (!d(str)) {
            return false;
        }
        if (!d(str2)) {
            return c(str2);
        }
        com.webengage.sdk.android.actions.rules.k.g gVar = this.f12493b.get(str2);
        com.webengage.sdk.android.actions.rules.k.g gVar2 = this.f12493b.get(str);
        return gVar.b() == gVar2.b() ? gVar2.c() : gVar2.b() < gVar.b();
    }
}
