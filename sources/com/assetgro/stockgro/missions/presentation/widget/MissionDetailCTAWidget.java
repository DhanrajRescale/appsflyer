package com.assetgro.stockgro.missions.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.ls;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.button.MaterialButton;
import jc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import r3.k;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/widget/MissionDetailCTAWidget;", "Landroid/widget/LinearLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "isEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "setEnablePrimaryButton", "Ljc/b;", "b", "Ljc/b;", "getOnCTAAction", "()Ljc/b;", "setOnCTAAction", "(Ljc/b;)V", "onCTAAction", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionDetailCTAWidget extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8929c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ls f8930a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public b onCTAAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissionDetailCTAWidget(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = ls.f5393u;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        ls lsVar = (ls) m.g(from, R.layout.layout_mission_detail_cta, this, true, null);
        Intrinsics.checkNotNullExpressionValue(lsVar, "inflate(...)");
        this.f8930a = lsVar;
    }

    public final b getOnCTAAction() {
        return this.onCTAAction;
    }

    public final void setEnablePrimaryButton(boolean isEnabled) {
        ls lsVar = this.f8930a;
        if (isEnabled) {
            MaterialButton materialButton = lsVar.f5394s;
            materialButton.setEnabled(true);
            materialButton.setBackground(k.getDrawable(materialButton.getContext(), R.drawable.primary_button));
            materialButton.setTextColor(k.getColor(materialButton.getContext(), R.color.primary_button_text_color));
            return;
        }
        MaterialButton materialButton2 = lsVar.f5394s;
        materialButton2.setEnabled(false);
        materialButton2.setBackground(k.getDrawable(materialButton2.getContext(), R.drawable.button_disabled));
        materialButton2.setTextColor(k.getColor(materialButton2.getContext(), R.color.grey_827F92));
    }

    public final void setOnCTAAction(b bVar) {
        this.onCTAAction = bVar;
    }
}
