package kb;

import com.assetgro.stockgro.data.remote.request.PostCommentReactionDto;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class r extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f23060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23061c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PostCommentReactionDto f23062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(CommentsViewModel commentsViewModel, String str, PostCommentReactionDto postCommentReactionDto, yt.a aVar) {
        super(2, aVar);
        this.f23060b = commentsViewModel;
        this.f23061c = str;
        this.f23062d = postCommentReactionDto;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new r(this.f23060b, this.f23061c, this.f23062d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23059a;
        CommentsViewModel commentsViewModel = this.f23060b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                commentsViewModel.i(new g(this.f23061c));
                FeedRepository feedRepository = commentsViewModel.f8805n;
                PostCommentReactionDto postCommentReactionDto = this.f23062d;
                this.f23059a = 1;
                if (feedRepository.handlePostCommentReaction(postCommentReactionDto, this) == aVar) {
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
