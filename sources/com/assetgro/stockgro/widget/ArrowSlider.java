package com.assetgro.stockgro.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.gq;
import ba.ij;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueWinnerViewModel;
import com.assetgro.stockgro.ui.arena.detail.post.leaderboard.winner.LeagueWinnersActivity;
import com.assetgro.stockgro.widget.ArrowSlider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qj.f;
import vt.i0;
import vt.y;
import yk.u;
import zc.i;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/assetgro/stockgro/widget/ArrowSlider;", "Landroidx/constraintlayout/widget/ConstraintLayout;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "titles", HttpUrl.FRAGMENT_ENCODE_SET, "setTitleList", "Landroid/widget/ImageView;", "getPrev", "getNext", "Landroid/widget/TextView;", "getTitle", HttpUrl.FRAGMENT_ENCODE_SET, "selectedItem", "setSelectedItem", "Lqj/f;", u.f41726f, "Lqj/f;", "getItemSelectListener", "()Lqj/f;", "setItemSelectListener", "(Lqj/f;)V", "itemSelectListener", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ArrowSlider extends ConstraintLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f10583w = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f10584s;

    /* renamed from: t, reason: collision with root package name */
    public List f10585t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public f itemSelectListener;

    /* renamed from: v, reason: collision with root package name */
    public final gq f10587v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrowSlider(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        LayoutInflater from = LayoutInflater.from(context);
        int i11 = gq.f4852v;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        final int i12 = 1;
        gq gqVar = (gq) m.g(from, R.layout.layout_arrow_slider, this, true, null);
        Intrinsics.checkNotNullExpressionValue(gqVar, "inflate(...)");
        this.f10587v = gqVar;
        this.f10585t = i0.f38321a;
        gqVar.f4854t.setOnClickListener(new View.OnClickListener(this) { // from class: qj.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArrowSlider f31997b;

            {
                this.f31997b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i10;
                boolean z10 = true;
                ArrowSlider this$0 = this.f31997b;
                switch (i13) {
                    case 0:
                        int i14 = ArrowSlider.f10583w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list = this$0.f10585t;
                        if (list != null) {
                            boolean z11 = !list.isEmpty();
                            int i15 = this$0.f10584s;
                            if (i15 <= 0) {
                                z10 = false;
                            }
                            if (z11 & z10) {
                                int i16 = i15 - 1;
                                this$0.f10584s = i16;
                                this$0.setSelectedItem(i16);
                                return;
                            }
                            return;
                        }
                        Intrinsics.k("items");
                        throw null;
                    default:
                        int i17 = ArrowSlider.f10583w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int i18 = this$0.f10584s;
                        List list2 = this$0.f10585t;
                        if (list2 != null) {
                            if (i18 != list2.size() - 1) {
                                int i19 = this$0.f10584s + 1;
                                this$0.f10584s = i19;
                                this$0.setSelectedItem(i19);
                                return;
                            }
                            return;
                        }
                        Intrinsics.k("items");
                        throw null;
                }
            }
        });
        gqVar.f4853s.setOnClickListener(new View.OnClickListener(this) { // from class: qj.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArrowSlider f31997b;

            {
                this.f31997b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                boolean z10 = true;
                ArrowSlider this$0 = this.f31997b;
                switch (i13) {
                    case 0:
                        int i14 = ArrowSlider.f10583w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list = this$0.f10585t;
                        if (list != null) {
                            boolean z11 = !list.isEmpty();
                            int i15 = this$0.f10584s;
                            if (i15 <= 0) {
                                z10 = false;
                            }
                            if (z11 & z10) {
                                int i16 = i15 - 1;
                                this$0.f10584s = i16;
                                this$0.setSelectedItem(i16);
                                return;
                            }
                            return;
                        }
                        Intrinsics.k("items");
                        throw null;
                    default:
                        int i17 = ArrowSlider.f10583w;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        int i18 = this$0.f10584s;
                        List list2 = this$0.f10585t;
                        if (list2 != null) {
                            if (i18 != list2.size() - 1) {
                                int i19 = this$0.f10584s + 1;
                                this$0.f10584s = i19;
                                this$0.setSelectedItem(i19);
                                return;
                            }
                            return;
                        }
                        Intrinsics.k("items");
                        throw null;
                }
            }
        });
    }

    public final f getItemSelectListener() {
        return this.itemSelectListener;
    }

    @NotNull
    public final ImageView getNext() {
        ImageView next = this.f10587v.f4853s;
        Intrinsics.checkNotNullExpressionValue(next, "next");
        return next;
    }

    @NotNull
    public final ImageView getPrev() {
        ImageView previous = this.f10587v.f4854t;
        Intrinsics.checkNotNullExpressionValue(previous, "previous");
        return previous;
    }

    @NotNull
    public final TextView getTitle() {
        TextView title = this.f10587v.f4855u;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        return title;
    }

    public final void setItemSelectListener(f fVar) {
        this.itemSelectListener = fVar;
    }

    public final void setSelectedItem(int selectedItem) {
        List list = this.f10585t;
        if (list != null) {
            if (y.e(list).h(selectedItem)) {
                TextView textView = this.f10587v.f4855u;
                List list2 = this.f10585t;
                if (list2 != null) {
                    textView.setText((CharSequence) list2.get(selectedItem));
                    f fVar = this.itemSelectListener;
                    if (fVar != null) {
                        List list3 = this.f10585t;
                        if (list3 != null) {
                            String item = (String) list3.get(selectedItem);
                            eb.f fVar2 = (eb.f) fVar;
                            int i10 = fVar2.f15308a;
                            Object obj = fVar2.f15309b;
                            switch (i10) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(item, "item");
                                    ((ij) ((i) obj).q()).I.setCurrentItem(selectedItem);
                                    return;
                                default:
                                    Intrinsics.checkNotNullParameter(item, "item");
                                    LeagueWinnersActivity leagueWinnersActivity = (LeagueWinnersActivity) obj;
                                    LeagueWinnerViewModel leagueWinnerViewModel = (LeagueWinnerViewModel) leagueWinnersActivity.x();
                                    leagueWinnerViewModel.f9042v = selectedItem + 1;
                                    leagueWinnerViewModel.h(false);
                                    ((LeagueWinnerViewModel) leagueWinnersActivity.x()).f9038r.postValue(Boolean.FALSE);
                                    return;
                            }
                        }
                        Intrinsics.k("items");
                        throw null;
                    }
                    return;
                }
                Intrinsics.k("items");
                throw null;
            }
            return;
        }
        Intrinsics.k("items");
        throw null;
    }

    public final void setTitleList(List<String> titles) {
        if (titles != null) {
            this.f10585t = titles;
            if (!titles.isEmpty()) {
                setSelectedItem(0);
            }
        }
    }
}
