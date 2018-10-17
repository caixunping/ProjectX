/*
 * Copyright (C) 2018 AlexMofer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package am.project.x.business.others.opentype;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import am.project.x.R;

/**
 * ViewHolder
 */
class OpenTypeViewHolder extends RecyclerView.ViewHolder {

    private final TextView mVLabel;
    private final TextView mVInfo;

    OpenTypeViewHolder(ViewGroup parent) {
        super(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_opentype_item, parent, false));
        mVLabel = itemView.findViewById(R.id.ioi_tv_label);
        mVInfo = itemView.findViewById(R.id.ioi_tv_info);
    }

    void bind(int position, OpenTypeAdapterViewModel model) {
        final Object item = model.getItem(position);
        mVLabel.setText(model.getItemLabel(item));
        mVInfo.setText(model.getItemInfo(item));
    }
}