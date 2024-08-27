package wl;

import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import lu.d;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Set f39288a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39289b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39290c;

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.ranges.c, java.lang.Object, kotlin.ranges.IntRange] */
    public u(ArrayList arrayList) {
        ArrayList arrayList2;
        HashSet hashSet;
        String nonce = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(nonce, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        ?? cVar = new kotlin.ranges.c(43, 128, 1);
        d.Companion random = lu.d.INSTANCE;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            int L = yk.g.L(random, cVar);
            Iterable aVar = new kotlin.ranges.a('a', 'z');
            kotlin.ranges.a elements = new kotlin.ranges.a('A', 'Z');
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (aVar instanceof Collection) {
                arrayList2 = vt.g0.I(elements, (Collection) aVar);
            } else {
                ArrayList arrayList3 = new ArrayList();
                vt.d0.m(aVar, arrayList3);
                vt.d0.m(elements, arrayList3);
                arrayList2 = arrayList3;
            }
            ArrayList J = vt.g0.J('~', vt.g0.J('_', vt.g0.J('.', vt.g0.J('-', vt.g0.I(new kotlin.ranges.a('0', '9'), arrayList2)))));
            ArrayList arrayList4 = new ArrayList(L);
            for (int i10 = 0; i10 < L; i10++) {
                arrayList4.add(Character.valueOf(((Character) vt.g0.K(J, lu.d.INSTANCE)).charValue()));
            }
            String codeVerifier = vt.g0.B(arrayList4, HttpUrl.FRAGMENT_ENCODE_SET, null, null, null, 62);
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
            if (nonce != null && nonce.length() != 0) {
                if ((!(kotlin.text.w.z(nonce, ' ', 0, false, 6) >= 0)) && hl.f.y0(codeVerifier)) {
                    if (arrayList != null) {
                        hashSet = new HashSet(arrayList);
                    } else {
                        hashSet = new HashSet();
                    }
                    hashSet.add(Scopes.OPEN_ID);
                    Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
                    Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(permissions)");
                    this.f39288a = unmodifiableSet;
                    this.f39289b = nonce;
                    this.f39290c = codeVerifier;
                    return;
                }
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
