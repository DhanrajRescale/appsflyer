package com.assetgro.stockgro.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.iq;
import com.assetgro.stockgro.prod.R;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.g0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R2\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/assetgro/stockgro/widget/ChipGroupView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getSelectedTagIds", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "t", "Ljava/util/HashSet;", "getCheckedIds", "()Ljava/util/HashSet;", "setCheckedIds", "(Ljava/util/HashSet;)V", "checkedIds", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ChipGroupView extends ConstraintLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f10601u = 0;

    /* renamed from: s, reason: collision with root package name */
    public final iq f10602s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public HashSet checkedIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipGroupView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.checkedIds = new HashSet();
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = iq.f5073u;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        iq iqVar = (iq) m.g(from, R.layout.layout_chip_group_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(iqVar, "inflate(...)");
        this.f10602s = iqVar;
    }

    @NotNull
    public final HashSet<String> getCheckedIds() {
        return this.checkedIds;
    }

    @NotNull
    public final List<String> getSelectedTagIds() {
        return g0.R(this.checkedIds);
    }

    public final void setCheckedIds(@NotNull HashSet<String> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
        this.checkedIds = hashSet;
    }
}
