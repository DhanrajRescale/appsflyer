package com.assetgro.stockgro.missions.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.ft;
import ba.ht;
import ba.jt;
import com.assetgro.stockgro.missions.domain.model.MissionDetail;
import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.card.MaterialCardView;
import ic.a;
import jr.h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import r3.k;
import yk.j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/widget/MissionTaskBannerView;", "Landroid/widget/LinearLayout;", "Lcom/assetgro/stockgro/missions/domain/model/MissionDetail;", "mission", HttpUrl.FRAGMENT_ENCODE_SET, "setMissionViewByStatus", "setMissionStatusChipView", "setMissionData", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionTaskBannerView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ht f8939a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissionTaskBannerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = ht.B;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        ht htVar = (ht) m.g(from, R.layout.layout_missions_card_header_banner, this, true, null);
        Intrinsics.checkNotNullExpressionValue(htVar, "inflate(...)");
        this.f8939a = htVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0232, code lost:
    
        if (r7 == 4) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fd, code lost:
    
        if (r12 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0288, code lost:
    
        if (r7 == 4) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void setMissionStatusChipView(com.assetgro.stockgro.missions.domain.model.MissionDetail r20) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.missions.presentation.widget.MissionTaskBannerView.setMissionStatusChipView(com.assetgro.stockgro.missions.domain.model.MissionDetail):void");
    }

    private final void setMissionViewByStatus(MissionDetail mission) {
        int i10;
        MissionStatus status = j.Z0(mission.getStatus());
        setMissionStatusChipView(mission);
        ft ftVar = this.f8939a.f4972t;
        MaterialCardView rewardChipContainer = ftVar.f4742s;
        Intrinsics.checkNotNullExpressionValue(rewardChipContainer, "rewardChipContainer");
        Intrinsics.checkNotNullParameter(rewardChipContainer, "<this>");
        Intrinsics.checkNotNullParameter(status, "status");
        int i11 = a.f19841a[status.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        i10 = R.color.green_19A574;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i10 = R.color.red_new;
                }
            } else {
                i10 = R.color.blue_12BDF3;
            }
        } else {
            i10 = R.color.yellow_FFAA00;
        }
        rewardChipContainer.setCardBackgroundColor(k.getColor(rewardChipContainer.getContext(), i10));
        ImageView rewardIcon = ftVar.f4743t;
        Intrinsics.checkNotNullExpressionValue(rewardIcon, "rewardIcon");
        kp.j.Y(rewardIcon, mission.getReward().getType());
    }

    public final void setMissionData(@NotNull MissionDetail mission) {
        String valueOf;
        Intrinsics.checkNotNullParameter(mission, "mission");
        setMissionViewByStatus(mission);
        jt jtVar = (jt) this.f8939a;
        jtVar.f4976x = mission.getTitle();
        synchronized (jtVar) {
            jtVar.C |= 8;
        }
        jtVar.a(23);
        jtVar.m();
        jtVar.f4977y = mission.getLogo();
        synchronized (jtVar) {
            jtVar.C |= 4;
        }
        jtVar.a(13);
        jtVar.m();
        getContext().getString(R.string.label_your_reward_with_colon);
        synchronized (jtVar) {
            jtVar.C |= 32;
        }
        jtVar.a(19);
        jtVar.m();
        if (Intrinsics.a(mission.getStatus(), MissionStatus.COMPLETED.getParamName())) {
            valueOf = h.n("+", mission.getReward().getAmount());
        } else {
            valueOf = String.valueOf(mission.getReward().getAmount());
        }
        jtVar.A = valueOf;
        synchronized (jtVar) {
            jtVar.C |= 16;
        }
        jtVar.a(18);
        jtVar.m();
    }
}
