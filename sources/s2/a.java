package s2;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q2.c;
import q2.d;
import q2.e;
import vt.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34182a = new Object();

    @NotNull
    public final Object a(@NotNull d dVar) {
        ArrayList arrayList = new ArrayList(z.k(dVar));
        Iterator it = dVar.f31579a.iterator();
        while (it.hasNext()) {
            e eVar = ((c) it.next()).f31578a;
            Intrinsics.d(eVar, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            arrayList.add(((q2.a) eVar).f31574a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(@NotNull r2.d dVar, @NotNull d dVar2) {
        ArrayList arrayList = new ArrayList(z.k(dVar2));
        Iterator it = dVar2.f31579a.iterator();
        while (it.hasNext()) {
            e eVar = ((c) it.next()).f31578a;
            Intrinsics.d(eVar, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            arrayList.add(((q2.a) eVar).f31574a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        dVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
