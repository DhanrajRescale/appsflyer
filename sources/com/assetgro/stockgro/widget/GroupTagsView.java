package com.assetgro.stockgro.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.nr;
import com.assetgro.stockgro.data.model.Tags;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qj.j;
import vt.y;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/widget/GroupTagsView;", "Landroid/widget/LinearLayout;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/assetgro/stockgro/data/model/Tags;", "tags", HttpUrl.FRAGMENT_ENCODE_SET, "setTags", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupTagsView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final nr f10628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupTagsView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = nr.f5601v;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        nr nrVar = (nr) m.g(from, R.layout.layout_group_tags_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(nrVar, "inflate(...)");
        this.f10628a = nrVar;
    }

    public final void setTags(@NotNull List<Tags> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (!tags.isEmpty()) {
            nr nrVar = this.f10628a;
            nrVar.f5604u.setVisibility(0);
            if (y.e(tags).h(0)) {
                ChipView groupTagFirst = nrVar.f5602s;
                Intrinsics.checkNotNullExpressionValue(groupTagFirst, "groupTagFirst");
                String tagName = tags.get(0).getTagName();
                groupTagFirst.setVisibility(0);
                groupTagFirst.setChipText(tagName);
                groupTagFirst.setChipType(j.f32026j);
                groupTagFirst.setChipTextColor(R.color.colorAccent);
            }
            if (y.e(tags).h(1)) {
                ChipView groupTagSecond = nrVar.f5603t;
                Intrinsics.checkNotNullExpressionValue(groupTagSecond, "groupTagSecond");
                String tagName2 = tags.get(1).getTagName();
                groupTagSecond.setVisibility(0);
                groupTagSecond.setChipText(tagName2);
                groupTagSecond.setChipType(j.f32026j);
                groupTagSecond.setChipTextColor(R.color.colorAccent);
            }
        }
    }
}
