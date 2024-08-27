package com.assetgro.stockgro.feature_social.presentation.feed.comments;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.assetgro.stockgro.ui.social.domain.model.CommentMetaData;
import com.assetgro.stockgro.ui.social.domain.model.Interaction;
import e1.s;
import e1.x;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.UUID;
import kb.b;
import kb.c;
import kb.d;
import kb.e;
import kb.f;
import kb.h;
import kb.i;
import kb.j;
import kb.k;
import kb.l;
import kb.m;
import kb.p;
import kb.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import t0.n1;
import t0.o3;
import t0.t;
import tu.k1;
import tu.l1;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/assetgro/stockgro/feature_social/presentation/feed/comments/CommentsViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "kb/b", "kb/c", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class CommentsViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final FeedRepository f8805n;

    /* renamed from: o, reason: collision with root package name */
    public final n1 f8806o;

    /* renamed from: p, reason: collision with root package name */
    public final n1 f8807p;

    /* renamed from: q, reason: collision with root package name */
    public final s f8808q;

    /* renamed from: r, reason: collision with root package name */
    public final s f8809r;

    /* renamed from: s, reason: collision with root package name */
    public final String f8810s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8811t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f8812u;

    /* renamed from: v, reason: collision with root package name */
    public final k1 f8813v;

    /* renamed from: w, reason: collision with root package name */
    public final k1 f8814w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8815x;

    /* renamed from: y, reason: collision with root package name */
    public int f8816y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8817z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public CommentsViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, FeedRepository feedRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(feedRepository, "feedRepository");
        this.f8805n = feedRepository;
        n1 n0 = t.n0(new b(null, 0, kb.a.f23021b, false, false, null, null), o3.f35116a);
        this.f8806o = n0;
        this.f8807p = n0;
        s sVar = new s();
        this.f8808q = sVar;
        this.f8809r = sVar;
        this.f8810s = userRepository.getCurrentUserId();
        ?? liveData = new LiveData(UUID.randomUUID().toString());
        this.f8811t = liveData;
        this.f8812u = liveData;
        k1 a10 = l1.a(null);
        this.f8813v = a10;
        this.f8814w = a10;
        this.f8815x = 10;
        this.f8817z = true;
    }

    public final void h(kb.a aVar) {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            g.H(u0.f(this), null, null, new p(this, aVar, null), 3);
            return;
        }
        String str = ((b) this.f8807p.getValue()).f23024a;
        if (str != null && str.length() != 0) {
            g.H(u0.f(this), null, null, new q(this, aVar, null), 3);
        } else {
            i(new j("PostID can not be null."));
        }
    }

    public final void i(g viewStateEvent) {
        CommentMetaData copy;
        CommentMetaData copy2;
        Object obj;
        Intrinsics.checkNotNullParameter(viewStateEvent, "viewStateEvent");
        boolean z10 = viewStateEvent instanceof f;
        int i10 = 0;
        n1 n1Var = this.f8806o;
        s sVar = this.f8808q;
        if (z10) {
            sVar.clear();
            this.f8816y = 0;
            this.f8817z = true;
            f fVar = (f) viewStateEvent;
            n1Var.setValue(b.a((b) n1Var.getValue(), fVar.f23037c, fVar.f23036b, kb.a.f23021b, false, false, null, 16));
            j(c.f23031a);
            return;
        }
        if (viewStateEvent instanceof d) {
            this.f8817z = true;
            ArrayList arrayList = new ArrayList();
            for (CommentMetaData commentMetaData : ((d) viewStateEvent).f23034b) {
                ListIterator listIterator = this.f8809r.listIterator();
                while (true) {
                    x xVar = (x) listIterator;
                    if (xVar.hasNext()) {
                        obj = xVar.next();
                        if (Intrinsics.a(((CommentMetaData) obj).getCommentId(), commentMetaData.getCommentId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj == null) {
                    arrayList.add(commentMetaData);
                }
            }
            sVar.addAll(arrayList);
            n1Var.setValue(b.a((b) n1Var.getValue(), null, 0, null, false, false, null, 123));
            j(null);
            return;
        }
        if (viewStateEvent instanceof h) {
            sVar.clear();
            n1Var.setValue(b.a((b) n1Var.getValue(), null, 0, null, true, false, null, 115));
            j(null);
            return;
        }
        if (viewStateEvent instanceof l) {
            n1Var.setValue(b.a((b) n1Var.getValue(), null, 0, ((l) viewStateEvent).f23043b, false, false, null, 123));
            j(null);
            return;
        }
        if (viewStateEvent instanceof k) {
            n1Var.setValue(b.a((b) n1Var.getValue(), null, 0, null, false, ((k) viewStateEvent).f23042b, null, 111));
            return;
        }
        if (viewStateEvent instanceof j) {
            n1Var.setValue(b.a((b) n1Var.getValue(), null, 0, null, false, false, ((j) viewStateEvent).f23041b, 91));
            j(c.f23032b);
            return;
        }
        if (viewStateEvent instanceof e) {
            ListIterator listIterator2 = sVar.listIterator();
            while (true) {
                x xVar2 = (x) listIterator2;
                if (xVar2.hasNext()) {
                    if (Intrinsics.a(((CommentMetaData) xVar2.next()).getCommentId(), ((e) viewStateEvent).f23035b)) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                sVar.remove(i10);
            }
            n1Var.setValue(b.a((b) n1Var.getValue(), null, ((b) n1Var.getValue()).f23025b - 1, null, false, false, null, 121));
            j(null);
            return;
        }
        if (viewStateEvent instanceof kb.g) {
            ListIterator listIterator3 = sVar.listIterator();
            int i11 = 0;
            while (true) {
                x xVar3 = (x) listIterator3;
                if (xVar3.hasNext()) {
                    if (Intrinsics.a(((CommentMetaData) xVar3.next()).getCommentId(), ((kb.g) viewStateEvent).f23038b)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 != -1) {
                boolean z11 = !((CommentMetaData) sVar.get(i11)).isLiked();
                CommentMetaData commentMetaData2 = (CommentMetaData) sVar.get(i11);
                if (z11) {
                    i10 = ((CommentMetaData) sVar.get(i11)).getLikesCount() + 1;
                } else if (((CommentMetaData) sVar.get(i11)).getLikesCount() > 0) {
                    i10 = ((CommentMetaData) sVar.get(i11)).getLikesCount() - 1;
                }
                copy2 = commentMetaData2.copy((r20 & 1) != 0 ? commentMetaData2.commentId : null, (r20 & 2) != 0 ? commentMetaData2.postId : null, (r20 & 4) != 0 ? commentMetaData2.senderId : null, (r20 & 8) != 0 ? commentMetaData2.isLiked : z11, (r20 & 16) != 0 ? commentMetaData2.creatorInfo : null, (r20 & 32) != 0 ? commentMetaData2.commentsContent : null, (r20 & 64) != 0 ? commentMetaData2.timestamp : null, (r20 & 128) != 0 ? commentMetaData2.interaction : null, (r20 & 256) != 0 ? commentMetaData2.likesCount : i10);
                sVar.set(i11, copy2);
            }
            j(null);
            return;
        }
        if (viewStateEvent instanceof i) {
            ListIterator listIterator4 = sVar.listIterator();
            int i12 = 0;
            while (true) {
                x xVar4 = (x) listIterator4;
                if (xVar4.hasNext()) {
                    if (Intrinsics.a(((CommentMetaData) xVar4.next()).getCommentId(), ((i) viewStateEvent).f23040b)) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    i12 = -1;
                    break;
                }
            }
            if (i12 != -1) {
                CommentMetaData commentMetaData3 = (CommentMetaData) sVar.get(i12);
                Interaction interaction = ((CommentMetaData) sVar.get(i12)).getInteraction();
                if (interaction == null) {
                    interaction = new Interaction(null, null, false);
                }
                copy = commentMetaData3.copy((r20 & 1) != 0 ? commentMetaData3.commentId : null, (r20 & 2) != 0 ? commentMetaData3.postId : null, (r20 & 4) != 0 ? commentMetaData3.senderId : null, (r20 & 8) != 0 ? commentMetaData3.isLiked : false, (r20 & 16) != 0 ? commentMetaData3.creatorInfo : null, (r20 & 32) != 0 ? commentMetaData3.commentsContent : null, (r20 & 64) != 0 ? commentMetaData3.timestamp : null, (r20 & 128) != 0 ? commentMetaData3.interaction : Interaction.copy$default(interaction, null, null, true, 3, null), (r20 & 256) != 0 ? commentMetaData3.likesCount : 0);
                sVar.set(i12, copy);
            }
            j(null);
            return;
        }
        if (viewStateEvent instanceof m) {
            n1Var.setValue(b.a((b) n1Var.getValue(), null, ((m) viewStateEvent).f23044b, null, false, false, null, 121));
            j(null);
        }
    }

    public final void j(c cVar) {
        this.f8811t.postValue(UUID.randomUUID().toString());
        this.f8813v.m(cVar);
    }
}
