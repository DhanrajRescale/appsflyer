package kb;

import com.assetgro.stockgro.data.remote.request.CreatePostCommentRequestDto;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.ui.social.domain.model.CommentContent;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import iu.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import qu.f0;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f23046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23047c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CommentsViewModel commentsViewModel, String str, String str2, yt.a aVar) {
        super(2, aVar);
        this.f23046b = commentsViewModel;
        this.f23047c = str;
        this.f23048d = str2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n(this.f23046b, this.f23047c, this.f23048d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        String string;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23045a;
        CommentsViewModel commentsViewModel = this.f23046b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                commentsViewModel.i(new l(a.f23022c));
                FeedRepository feedRepository = commentsViewModel.f8805n;
                CreatePostCommentRequestDto createPostCommentRequestDto = new CreatePostCommentRequestDto(this.f23047c, feedRepository.getUserId(), new CommentContent(this.f23048d, null, null));
                this.f23045a = 1;
                obj = feedRepository.createPostComment(createPostCommentRequestDto, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            v0 v0Var = (v0) obj;
            if (v0Var.f29302a.isSuccessful()) {
                commentsViewModel.i(new m(((b) commentsViewModel.f8806o.getValue()).f23025b + 1));
                commentsViewModel.h(a.f23022c);
            } else {
                z zVar = new z();
                String message = v0Var.f29302a.message();
                if (message == null) {
                    message = "Technical Error Occurred";
                }
                zVar.f20560a = message;
                try {
                    ResponseBody responseBody = v0Var.f29304c;
                    if (responseBody != null && (string = responseBody.string()) != null) {
                        String string2 = new JSONObject(string).getString("message");
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        zVar.f20560a = string2;
                    }
                } catch (Exception e10) {
                    FirebaseCrashlytics.getInstance().recordException(new Throwable(e10.getMessage()));
                }
                commentsViewModel.i(new j((String) zVar.f20560a));
            }
        } catch (Exception e11) {
            commentsViewModel.i(new j(e11.getMessage()));
        }
        return Unit.f23355a;
    }
}
