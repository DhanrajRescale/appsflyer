package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f2347q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f2348r = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f2349a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2350b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2351c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2352d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2353e;

    /* renamed from: f, reason: collision with root package name */
    public final ut.g f2354f;

    /* renamed from: g, reason: collision with root package name */
    public final ut.g f2355g;

    /* renamed from: h, reason: collision with root package name */
    public final ut.g f2356h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2357i;

    /* renamed from: j, reason: collision with root package name */
    public final ut.g f2358j;

    /* renamed from: k, reason: collision with root package name */
    public final ut.g f2359k;

    /* renamed from: l, reason: collision with root package name */
    public final ut.g f2360l;

    /* renamed from: m, reason: collision with root package name */
    public final ut.g f2361m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2362n;

    /* renamed from: o, reason: collision with root package name */
    public final ut.g f2363o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2364p;

    public z(String str, String str2, String mimeType) {
        List list;
        boolean z10;
        this.f2349a = str;
        this.f2350b = str2;
        this.f2351c = mimeType;
        ArrayList arrayList = new ArrayList();
        this.f2352d = arrayList;
        this.f2354f = ut.h.a(new x(this, 6));
        this.f2355g = ut.h.a(new x(this, 4));
        ut.i iVar = ut.i.f37392a;
        this.f2356h = ut.h.b(new x(this, 7));
        this.f2358j = ut.h.b(new x(this, 1));
        this.f2359k = ut.h.b(new x(this, 0));
        this.f2360l = ut.h.b(new x(this, 3));
        this.f2361m = ut.h.a(new x(this, 2));
        this.f2363o = ut.h.a(new x(this, 5));
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!f2347q.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String substring = str.substring(0, matcher.start());
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            a(substring, arrayList, sb2);
            if (!kotlin.text.w.s(sb2, ".*", false) && !kotlin.text.w.s(sb2, "([^/]+?)", false)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2364p = z10;
            sb2.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "uriRegex.toString()");
            this.f2353e = kotlin.text.s.n(sb3, ".*", "\\E.*\\Q", false);
        }
        if (mimeType != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(mimeType).matches()) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                List d10 = new Regex("/").d(mimeType);
                if (!d10.isEmpty()) {
                    ListIterator listIterator = d10.listIterator(d10.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = vt.g0.N(d10, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = vt.i0.f38321a;
                this.f2362n = kotlin.text.s.n(jr.h.s("^(", (String) list.get(0), "|[*]+)/(", (String) list.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]", false);
                return;
            }
            throw new IllegalArgumentException(nn.d.k("The given mimeType ", mimeType, " does not match to required \"type/subtype\" format").toString());
        }
    }

    public static void a(String str, List list, StringBuilder sb2) {
        Matcher matcher = f2348r.matcher(str);
        int i10 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            Intrinsics.d(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i10) {
                String substring = str.substring(i10, matcher.start());
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(Pattern.quote(substring));
            }
            sb2.append("([^/]+?)");
            i10 = matcher.end();
        }
        if (i10 < str.length()) {
            String substring2 = str.substring(i10);
            Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(substring2));
        }
    }

    public static void d(Bundle bundle, String key, String value, k kVar) {
        if (kVar != null) {
            s0 s0Var = kVar.f2230a;
            s0Var.getClass();
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            s0Var.e(bundle, key, s0Var.c(value));
            return;
        }
        bundle.putString(key, value);
    }

    public final boolean b(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.f2352d;
        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 >= 0) {
                String str = (String) next;
                String value = Uri.decode(matcher.group(i11));
                k kVar = (k) map.get(str);
                try {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    d(bundle, str, value, kVar);
                    arrayList2.add(Unit.f23355a);
                    i10 = i11;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                vt.y.j();
                throw null;
            }
        }
        return true;
    }

    public final boolean c(Uri uri, Bundle bundle, Map map) {
        Matcher matcher;
        String query;
        z zVar = this;
        for (Map.Entry entry : ((Map) zVar.f2356h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            w wVar = (w) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (zVar.f2357i && (query = uri.getQuery()) != null && !Intrinsics.a(query, uri.toString())) {
                queryParameters = vt.x.a(query);
            }
            if (queryParameters != null) {
                for (String str2 : queryParameters) {
                    String str3 = wVar.f2334a;
                    if (str3 != null) {
                        matcher = Pattern.compile(str3, 32).matcher(str2);
                    } else {
                        matcher = null;
                    }
                    int i10 = 0;
                    if (matcher == null || !matcher.matches()) {
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        ArrayList arrayList = wVar.f2335b;
                        ArrayList arrayList2 = new ArrayList(vt.z.k(arrayList));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i11 = i10 + 1;
                            if (i10 >= 0) {
                                String key = (String) next;
                                String group = matcher.group(i11);
                                if (group == null) {
                                    group = HttpUrl.FRAGMENT_ENCODE_SET;
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(group, "argMatcher.group(index + 1) ?: \"\"");
                                }
                                try {
                                    k kVar = (k) map.get(key);
                                    if (!bundle.containsKey(key)) {
                                        if (!Intrinsics.a(group, UrlTreeKt.componentParamPrefixChar + key + UrlTreeKt.componentParamSuffixChar)) {
                                            d(bundle2, key, group, kVar);
                                        }
                                    } else if (kVar != null) {
                                        s0 s0Var = kVar.f2230a;
                                        Object a10 = s0Var.a(bundle, key);
                                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                                        Intrinsics.checkNotNullParameter(key, "key");
                                        if (bundle.containsKey(key)) {
                                            s0Var.e(bundle, key, s0Var.d(group, a10));
                                        } else {
                                            throw new IllegalArgumentException("There is no previous value in this bundle.");
                                        }
                                    } else {
                                        continue;
                                    }
                                    arrayList2.add(Unit.f23355a);
                                    i10 = i11;
                                } catch (IllegalArgumentException unused) {
                                    continue;
                                }
                            } else {
                                vt.y.j();
                                throw null;
                            }
                        }
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
            zVar = this;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!Intrinsics.a(this.f2349a, zVar.f2349a) || !Intrinsics.a(this.f2350b, zVar.f2350b) || !Intrinsics.a(this.f2351c, zVar.f2351c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f2349a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        String str2 = this.f2350b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f2351c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return i14 + i12;
    }
}
