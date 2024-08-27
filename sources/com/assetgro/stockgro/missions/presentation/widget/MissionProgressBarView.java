package com.assetgro.stockgro.missions.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.bt;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import r3.k;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/widget/MissionProgressBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "timeLeft", HttpUrl.FRAGMENT_ENCODE_SET, "setTimeLeftText", HttpUrl.FRAGMENT_ENCODE_SET, "color", "setTrackColor", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionProgressBarView extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final bt f8938s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissionProgressBarView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = bt.f4316v;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        bt btVar = (bt) m.g(from, R.layout.layout_mission_progress_bar, this, true, null);
        Intrinsics.checkNotNullExpressionValue(btVar, "inflate(...)");
        this.f8938s = btVar;
    }

    public final void setTimeLeftText(String timeLeft) {
        this.f8938s.f4319u.setText(timeLeft);
    }

    public final void setTrackColor(int color) {
        this.f8938s.f4317s.setIndicatorColor(k.getColor(getContext(), color));
    }
}
