package cv;

import bv.b0;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f13094a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13095b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13096c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13097d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13098e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13099f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13100g;

    /* renamed from: h, reason: collision with root package name */
    public final long f13101h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13102i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13103j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f13104k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f13105l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f13106m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f13107n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f13108o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f13109p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f13110q;

    public /* synthetic */ g(b0 b0Var, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, int i13) {
        this(b0Var, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) != 0 ? -1L : j13, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) != 0 ? -1 : i12, (i13 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, null, null, null);
    }

    public g(b0 canonicalPath, boolean z10, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f13094a = canonicalPath;
        this.f13095b = z10;
        this.f13096c = comment;
        this.f13097d = j10;
        this.f13098e = j11;
        this.f13099f = j12;
        this.f13100g = i10;
        this.f13101h = j13;
        this.f13102i = i11;
        this.f13103j = i12;
        this.f13104k = l10;
        this.f13105l = l11;
        this.f13106m = l12;
        this.f13107n = num;
        this.f13108o = num2;
        this.f13109p = num3;
        this.f13110q = new ArrayList();
    }
}
