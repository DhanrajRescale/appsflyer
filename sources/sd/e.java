package sd;

import android.view.View;
import ba.iq;
import ba.yh;
import com.assetgro.stockgro.data.model.Tags;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupNameEditFragment;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupNameEditViewModel;
import com.assetgro.stockgro.widget.ChipGroupView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import iu.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q6.l;
import vt.d0;
import vt.v;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupNameEditFragment f34585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(GroupNameEditFragment groupNameEditFragment, int i10) {
        super(1);
        this.f34584a = i10;
        this.f34585b = groupNameEditFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f34584a;
        GroupNameEditFragment groupNameEditFragment = this.f34585b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                Intrinsics.c(bool);
                if (bool.booleanValue()) {
                    ((GroupNameEditViewModel) groupNameEditFragment.r()).f9209o.postValue(Boolean.FALSE);
                    l.h(groupNameEditFragment).p();
                }
                return Unit.f23355a;
            default:
                List<Tags> tags = (List) obj;
                yh yhVar = (yh) groupNameEditFragment.q();
                Intrinsics.c(tags);
                String[] selectedTags = ((GroupNameEditViewModel) groupNameEditFragment.r()).f9210p;
                ChipGroupView chipGroupView = yhVar.f6731t;
                chipGroupView.getClass();
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(selectedTags, "selectedTags");
                iq iqVar = chipGroupView.f10602s;
                iqVar.f5074s.removeAllViews();
                ArrayList views = new ArrayList();
                for (Tags tags2 : tags) {
                    Chip chip = new Chip(chipGroupView.getContext(), null);
                    fo.d z10 = fo.d.z(chipGroupView.getContext(), null, 0, R.style.ChipStyleNew);
                    Intrinsics.checkNotNullExpressionValue(z10, "createFromAttributes(...)");
                    chip.setChipDrawable(z10);
                    chip.setTextColor(r3.k.getColorStateList(chipGroupView.getContext(), R.color.chip_text_color_new));
                    chip.setText(tags2.getTagName());
                    chip.setChecked(v.o(selectedTags, tags2.getTagId()));
                    chip.setOnCheckedChangeListener(new yd.a(1, chipGroupView, chip, tags2));
                    views.add(chip);
                }
                ChipGroup chipGroup = iqVar.f5074s;
                Intrinsics.checkNotNullExpressionValue(chipGroup, "chipGroup");
                Intrinsics.checkNotNullParameter(chipGroup, "<this>");
                Intrinsics.checkNotNullParameter(views, "views");
                Iterator it = views.iterator();
                while (it.hasNext()) {
                    chipGroup.addView((View) it.next());
                }
                d0.n(chipGroupView.checkedIds, selectedTags);
                return Unit.f23355a;
        }
    }
}
