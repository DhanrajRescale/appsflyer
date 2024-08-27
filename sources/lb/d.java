package lb;

import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f24426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CommentsViewModel commentsViewModel, int i10, String str, yt.a aVar) {
        super(2, aVar);
        this.f24426a = commentsViewModel;
        this.f24427b = i10;
        this.f24428c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f24426a, this.f24427b, this.f24428c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        this.f24426a.i(new kb.f(this.f24427b, this.f24428c));
        return Unit.f23355a;
    }
}
