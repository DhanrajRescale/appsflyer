package kb;

import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class p extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f23053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f23054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CommentsViewModel commentsViewModel, a aVar, yt.a aVar2) {
        super(2, aVar2);
        this.f23053b = commentsViewModel;
        this.f23054c = aVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new p(this.f23053b, this.f23054c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23052a;
        CommentsViewModel commentsViewModel = this.f23053b;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            commentsViewModel.i(new l(this.f23054c));
            this.f23052a = 1;
            if (kp.j.K(500L, this) == aVar) {
                return aVar;
            }
        }
        commentsViewModel.i(h.f23039b);
        return Unit.f23355a;
    }
}
