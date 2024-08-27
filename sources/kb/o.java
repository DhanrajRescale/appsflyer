package kb;

import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class o extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f23050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(CommentsViewModel commentsViewModel, String str, yt.a aVar) {
        super(2, aVar);
        this.f23050b = commentsViewModel;
        this.f23051c = str;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new o(this.f23050b, this.f23051c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String str = this.f23051c;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23049a;
        CommentsViewModel commentsViewModel = this.f23050b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                commentsViewModel.i(new e(str));
                FeedRepository feedRepository = commentsViewModel.f8805n;
                this.f23049a = 1;
                if (feedRepository.deletePostComment(str, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            commentsViewModel.i(new j(e10.getMessage()));
            FirebaseCrashlytics.getInstance().recordException(e10);
        }
        return Unit.f23355a;
    }
}
