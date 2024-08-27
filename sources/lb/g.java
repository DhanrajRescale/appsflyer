package lb;

import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.remote.request.PostCommentReactionDto;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.ui.social.domain.model.CommentMetaData;
import e1.x;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f24451b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CommentsViewModel commentsViewModel, int i10) {
        super(1);
        this.f24450a = i10;
        this.f24451b = commentsViewModel;
    }

    public final void a(String commentId) {
        Object obj;
        boolean z10;
        int i10 = this.f24450a;
        CommentsViewModel commentsViewModel = this.f24451b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(commentId, "it");
                commentsViewModel.getClass();
                Intrinsics.checkNotNullParameter(commentId, "commentId");
                String userId = commentsViewModel.f8805n.getUserId();
                pe.a[] aVarArr = pe.a.f31008a;
                ListIterator listIterator = commentsViewModel.f8808q.listIterator();
                while (true) {
                    x xVar = (x) listIterator;
                    if (xVar.hasNext()) {
                        obj = xVar.next();
                        if (Intrinsics.a(((CommentMetaData) obj).getCommentId(), commentId)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                CommentMetaData commentMetaData = (CommentMetaData) obj;
                if (commentMetaData != null) {
                    z10 = commentMetaData.isLiked();
                } else {
                    z10 = false;
                }
                yk.g.H(u0.f(commentsViewModel), null, null, new kb.r(commentsViewModel, commentId, new PostCommentReactionDto(commentId, userId, "Like", z10), null), 3);
                return;
            default:
                Intrinsics.checkNotNullParameter(commentId, "it");
                commentsViewModel.getClass();
                Intrinsics.checkNotNullParameter(commentId, "comment");
                String str = ((kb.b) commentsViewModel.f8807p.getValue()).f23024a;
                if (str != null) {
                    yk.g.H(u0.f(commentsViewModel), null, null, new kb.n(commentsViewModel, str, commentId, null), 3);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f24450a) {
            case 0:
                a((String) obj);
                return Unit.f23355a;
            default:
                a((String) obj);
                return Unit.f23355a;
        }
    }
}
