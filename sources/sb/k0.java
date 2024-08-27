package sb;

import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f34502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f34503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f34504c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f34505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f34506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f34507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(FeedStreamViewModel feedStreamViewModel, c cVar, String str, Boolean bool, String str2, yt.a aVar) {
        super(2, aVar);
        this.f34503b = feedStreamViewModel;
        this.f34504c = cVar;
        this.f34505d = str;
        this.f34506e = bool;
        this.f34507f = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k0(this.f34503b, this.f34504c, this.f34505d, this.f34506e, this.f34507f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:7:0x0058, B:10:0x0064, B:12:0x0069, B:14:0x0071, B:16:0x0079, B:19:0x0080, B:21:0x0085, B:22:0x008d, B:24:0x00a3, B:26:0x00b5, B:28:0x00cd, B:30:0x00d5, B:31:0x00db, B:36:0x00e2, B:38:0x00ef, B:39:0x00f5, B:51:0x0051), top: B:50:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2 A[Catch: Exception -> 0x010a, TryCatch #0 {Exception -> 0x010a, blocks: (B:7:0x0058, B:10:0x0064, B:12:0x0069, B:14:0x0071, B:16:0x0079, B:19:0x0080, B:21:0x0085, B:22:0x008d, B:24:0x00a3, B:26:0x00b5, B:28:0x00cd, B:30:0x00d5, B:31:0x00db, B:36:0x00e2, B:38:0x00ef, B:39:0x00f5, B:51:0x0051), top: B:50:0x0051 }] */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
