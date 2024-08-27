package sd;

import android.text.Editable;
import android.text.TextWatcher;
import ba.qh;
import ba.yh;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupDescriptionEditFragment;
import com.assetgro.stockgro.ui.chat.detail.group.edit.GroupNameEditFragment;
import el.l;
import gd.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import r3.k;

/* loaded from: classes.dex */
public final class b implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f34577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f34578c;

    public /* synthetic */ b(m mVar, int i10, int i11) {
        this.f34576a = i11;
        this.f34578c = mVar;
        this.f34577b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f34576a;
        int i11 = this.f34577b;
        m mVar = this.f34578c;
        switch (i10) {
            case 0:
                GroupDescriptionEditFragment groupDescriptionEditFragment = (GroupDescriptionEditFragment) mVar;
                String valueOf = String.valueOf(editable);
                int i12 = GroupDescriptionEditFragment.f9201h;
                groupDescriptionEditFragment.getClass();
                if (valueOf.length() >= i11) {
                    qh qhVar = (qh) groupDescriptionEditFragment.q();
                    qhVar.f5865u.setBackground(k.getDrawable(groupDescriptionEditFragment.requireContext(), R.drawable.input_box_error_background));
                    ((qh) groupDescriptionEditFragment.q()).f5867w.setVisibility(8);
                    ((qh) groupDescriptionEditFragment.q()).f5866v.setVisibility(0);
                    ((qh) groupDescriptionEditFragment.q()).f5868x.setEnabled(false);
                    ((qh) groupDescriptionEditFragment.q()).f5868x.setAlpha(l.s(false));
                    return;
                }
                if (valueOf.length() == 0) {
                    qh qhVar2 = (qh) groupDescriptionEditFragment.q();
                    qhVar2.f5865u.setBackground(k.getDrawable(groupDescriptionEditFragment.requireContext(), R.drawable.input_box_error_background));
                    ((qh) groupDescriptionEditFragment.q()).f5867w.setVisibility(8);
                    ((qh) groupDescriptionEditFragment.q()).f5866v.setVisibility(0);
                    qh qhVar3 = (qh) groupDescriptionEditFragment.q();
                    qhVar3.f5866v.setText(groupDescriptionEditFragment.getString(R.string.text_min_length_group_desc_error));
                    ((qh) groupDescriptionEditFragment.q()).f5868x.setEnabled(false);
                    ((qh) groupDescriptionEditFragment.q()).f5868x.setAlpha(l.s(false));
                    return;
                }
                qh qhVar4 = (qh) groupDescriptionEditFragment.q();
                qhVar4.f5865u.setBackground(k.getDrawable(groupDescriptionEditFragment.requireContext(), R.drawable.input_box_background));
                ((qh) groupDescriptionEditFragment.q()).f5867w.setVisibility(0);
                ((qh) groupDescriptionEditFragment.q()).f5866v.setVisibility(8);
                ((qh) groupDescriptionEditFragment.q()).f5868x.setEnabled(true);
                ((qh) groupDescriptionEditFragment.q()).f5868x.setAlpha(l.s(true));
                return;
            default:
                GroupNameEditFragment groupNameEditFragment = (GroupNameEditFragment) mVar;
                String obj = w.X(String.valueOf(editable)).toString();
                int i13 = GroupNameEditFragment.f9206h;
                groupNameEditFragment.getClass();
                if (obj.length() >= i11) {
                    yh yhVar = (yh) groupNameEditFragment.q();
                    yhVar.f6733v.setBackground(k.getDrawable(groupNameEditFragment.requireContext(), R.drawable.input_box_error_background));
                    ((yh) groupNameEditFragment.q()).f6735x.setVisibility(8);
                    ((yh) groupNameEditFragment.q()).f6734w.setVisibility(0);
                    yh yhVar2 = (yh) groupNameEditFragment.q();
                    String string = groupNameEditFragment.getString(R.string.text_max_length_group_name_error);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    yhVar2.f6734w.setText(a3.a.m(new Object[]{Integer.valueOf(i11)}, 1, string, "format(...)"));
                    ((yh) groupNameEditFragment.q()).f6736y.setEnabled(false);
                    ((yh) groupNameEditFragment.q()).f6736y.setAlpha(l.s(false));
                    return;
                }
                if (obj.length() == 0) {
                    yh yhVar3 = (yh) groupNameEditFragment.q();
                    yhVar3.f6733v.setBackground(k.getDrawable(groupNameEditFragment.requireContext(), R.drawable.input_box_error_background));
                    ((yh) groupNameEditFragment.q()).f6735x.setVisibility(8);
                    ((yh) groupNameEditFragment.q()).f6734w.setVisibility(0);
                    yh yhVar4 = (yh) groupNameEditFragment.q();
                    yhVar4.f6734w.setText(groupNameEditFragment.getString(R.string.text_min_length_group_name_error));
                    ((yh) groupNameEditFragment.q()).f6736y.setEnabled(false);
                    ((yh) groupNameEditFragment.q()).f6736y.setAlpha(l.s(false));
                    return;
                }
                yh yhVar5 = (yh) groupNameEditFragment.q();
                yhVar5.f6733v.setBackground(k.getDrawable(groupNameEditFragment.requireContext(), R.drawable.input_box_background));
                ((yh) groupNameEditFragment.q()).f6735x.setVisibility(0);
                ((yh) groupNameEditFragment.q()).f6734w.setVisibility(8);
                ((yh) groupNameEditFragment.q()).f6736y.setEnabled(true);
                ((yh) groupNameEditFragment.q()).f6736y.setAlpha(l.s(true));
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
