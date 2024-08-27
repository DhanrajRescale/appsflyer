package kb;

import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import nv.v0;
import qu.f0;

/* loaded from: classes.dex */
public final class q extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public v0 f23055a;

    /* renamed from: b, reason: collision with root package name */
    public int f23056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f23057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f23058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CommentsViewModel commentsViewModel, a aVar, yt.a aVar2) {
        super(2, aVar2);
        this.f23057c = commentsViewModel;
        this.f23058d = aVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new q(this.f23057c, this.f23058d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:7:0x0010, B:8:0x005c, B:10:0x0060, B:12:0x0067, B:14:0x006d, B:16:0x0075, B:17:0x007b, B:19:0x007f, B:21:0x008a, B:23:0x0094, B:25:0x009c, B:27:0x00a8, B:28:0x00b2, B:29:0x00ad, B:31:0x00bc, B:32:0x00c6, B:34:0x00ca, B:37:0x00d2, B:42:0x0085, B:44:0x00d9, B:46:0x00df, B:47:0x00e5, B:50:0x00f1, B:51:0x00e2, B:54:0x001f, B:55:0x004c, B:60:0x0026), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9 A[Catch: Exception -> 0x0014, TryCatch #0 {Exception -> 0x0014, blocks: (B:7:0x0010, B:8:0x005c, B:10:0x0060, B:12:0x0067, B:14:0x006d, B:16:0x0075, B:17:0x007b, B:19:0x007f, B:21:0x008a, B:23:0x0094, B:25:0x009c, B:27:0x00a8, B:28:0x00b2, B:29:0x00ad, B:31:0x00bc, B:32:0x00c6, B:34:0x00ca, B:37:0x00d2, B:42:0x0085, B:44:0x00d9, B:46:0x00df, B:47:0x00e5, B:50:0x00f1, B:51:0x00e2, B:54:0x001f, B:55:0x004c, B:60:0x0026), top: B:2:0x0008 }] */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
