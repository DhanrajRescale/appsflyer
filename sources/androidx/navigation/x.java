package androidx.navigation;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f2339b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(z zVar, int i10) {
        super(0);
        this.f2338a = i10;
        this.f2339b = zVar;
    }

    public final Pattern a() {
        int i10 = this.f2338a;
        z zVar = this.f2339b;
        switch (i10) {
            case 2:
                String str = (String) zVar.f2360l.getValue();
                if (str == null) {
                    return null;
                }
                return Pattern.compile(str, 2);
            case 5:
                String str2 = zVar.f2362n;
                if (str2 == null) {
                    return null;
                }
                return Pattern.compile(str2);
            default:
                String str3 = zVar.f2353e;
                if (str3 == null) {
                    return null;
                }
                return Pattern.compile(str3, 2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        List list;
        int i10 = this.f2338a;
        boolean z10 = false;
        ?? r42 = 1;
        z zVar = this.f2339b;
        switch (i10) {
            case 0:
                Pair pair = (Pair) zVar.f2358j.getValue();
                if (pair == null || (list = (List) pair.f23353a) == null) {
                    return new ArrayList();
                }
                return list;
            case 1:
                String str = zVar.f2349a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb2 = new StringBuilder();
                Intrinsics.c(fragment);
                z.a(fragment, arrayList, sb2);
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "fragRegex.toString()");
                return new Pair(arrayList, sb3);
            case 2:
                return a();
            case 3:
                Pair pair2 = (Pair) zVar.f2358j.getValue();
                if (pair2 == null) {
                    return null;
                }
                return (String) pair2.f23354b;
            case 4:
                String str2 = zVar.f2349a;
                if (str2 != null && Uri.parse(str2).getQuery() != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 5:
                return a();
            case 6:
                return a();
            default:
                zVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) zVar.f2355g.getValue()).booleanValue()) {
                    String str3 = zVar.f2349a;
                    Uri parse = Uri.parse(str3);
                    for (String paramName : parse.getQueryParameterNames()) {
                        StringBuilder sb4 = new StringBuilder();
                        List<String> queryParams = parse.getQueryParameters(paramName);
                        if (queryParams.size() <= r42) {
                            Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                            String queryParam = (String) vt.g0.w(queryParams);
                            if (queryParam == null) {
                                zVar.f2357i = r42;
                                queryParam = paramName;
                            }
                            Matcher matcher = z.f2348r.matcher(queryParam);
                            w wVar = new w();
                            int i11 = 0;
                            int i12 = r42;
                            while (matcher.find()) {
                                String name = matcher.group(i12);
                                Intrinsics.d(name, "null cannot be cast to non-null type kotlin.String");
                                Intrinsics.checkNotNullParameter(name, "name");
                                wVar.f2335b.add(name);
                                Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                                String substring = queryParam.substring(i11, matcher.start());
                                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                sb4.append(Pattern.quote(substring));
                                sb4.append("(.+?)?");
                                i11 = matcher.end();
                                i12 = 1;
                            }
                            if (i11 < queryParam.length()) {
                                Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                                String substring2 = queryParam.substring(i11);
                                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                                sb4.append(Pattern.quote(substring2));
                            }
                            String sb5 = sb4.toString();
                            Intrinsics.checkNotNullExpressionValue(sb5, "argRegex.toString()");
                            wVar.f2334a = kotlin.text.s.n(sb5, ".*", "\\E.*\\Q", false);
                            Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                            linkedHashMap.put(paramName, wVar);
                            r42 = 1;
                        } else {
                            throw new IllegalArgumentException(jr.h.s("Query parameter ", paramName, " must only be present once in ", str3, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                    }
                }
                return linkedHashMap;
        }
    }
}
