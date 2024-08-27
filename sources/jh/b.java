package jh;

import android.graphics.Color;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import j2.b0;
import j2.e;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.f;
import kotlin.text.w;
import n1.t;
import o2.d0;
import o2.v;
import okhttp3.HttpUrl;
import vt.q0;
import vt.y;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21371a = y.g(new a(1, "Stock Name", "Name of the underlying stock."), new a(2, "Expiry Date", "The date on which the option expires."), new a(3, "Strike Price", "The agreed upon contract price at which the option can be exercised."), new a(4, "Type of Option", "\n Call option gives the user a right to buy at the strike price.\n Put option gives the user a right to sell at the strike price."), new a(5, "Current Price", "The last traded price of the option"), new a(6, "Breakeven/To Breakeven", " The price(change in percentage) of the underlying stock at which the call / put option reaches breakeven value"), new a(7, "Change in Price & Percentage", "The rate of change of the value of the option from the previous close."));

    public static final e a(String str, v vVar, v vVar2, t tVar) {
        f fVar;
        t tVar2;
        long j10;
        long j11;
        j2.c cVar = new j2.c();
        Iterator it = Regex.a(new Regex("<(\\w+)(.*?)>(.*?)</\\1>"), str).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            MatchResult matchResult = (MatchResult) it.next();
            String str2 = (String) matchResult.a().get(1);
            String input = (String) matchResult.a().get(2);
            String str3 = (String) matchResult.a().get(3);
            int i11 = matchResult.b().f23381a;
            int i12 = matchResult.b().f23382b + 1;
            String substring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            cVar.d(substring);
            Regex regex = new Regex("color:\\s*#([0-9a-fA-F]{6})");
            Intrinsics.checkNotNullParameter(input, "input");
            Matcher matcher = regex.f23392a.matcher(input);
            Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
            if (!matcher.find(0)) {
                fVar = null;
            } else {
                fVar = new f(matcher, input);
            }
            if (fVar != null) {
                tVar2 = new t(androidx.compose.ui.graphics.a.c(Color.parseColor("#" + ((String) ((q0) fVar.a()).get(1)))));
            } else {
                tVar2 = tVar;
            }
            if (w.s(str3, UrlTreeKt.configurablePathSegmentPrefix, false)) {
                cVar.b(a(str3, vVar, vVar2, tVar2));
            } else {
                cVar.d(str3);
                boolean a10 = Intrinsics.a(str2, "b");
                StringBuilder sb2 = cVar.f20675a;
                if (a10) {
                    if (tVar2 != null) {
                        j11 = tVar2.f28179a;
                    } else {
                        j11 = t.f28177i;
                    }
                    cVar.a(new b0(j11, 0L, d0.f29466h, null, null, vVar, null, 0L, null, null, null, 0L, null, null, 65498), sb2.length() - str3.length(), sb2.length());
                } else {
                    if (tVar2 != null) {
                        j10 = tVar2.f28179a;
                    } else {
                        j10 = t.f28177i;
                    }
                    cVar.a(new b0(j10, 0L, null, null, null, vVar2, null, 0L, null, null, null, 0L, null, null, 65502), sb2.length() - str3.length(), sb2.length());
                }
            }
            i10 = i12;
        }
        String substring2 = str.substring(i10);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        cVar.d(substring2);
        return cVar.i();
    }

    public static final e b(String str, v boldFont, v defaultFont) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(boldFont, "boldFont");
        Intrinsics.checkNotNullParameter(defaultFont, "defaultFont");
        try {
            return a(str, boldFont, defaultFont, null);
        } catch (Exception e10) {
            e10.printStackTrace();
            return new e(HttpUrl.FRAGMENT_ENCODE_SET, null, 6);
        }
    }
}
