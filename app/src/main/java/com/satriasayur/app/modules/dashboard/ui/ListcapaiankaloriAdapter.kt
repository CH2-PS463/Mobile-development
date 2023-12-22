package com.satriasayur.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.satriasayur.app.R
import com.satriasayur.app.databinding.RowListcapaiankaloriBinding
import com.satriasayur.app.modules.dashboard.`data`.model.ListcapaiankaloriRowModel
import kotlin.Int
import kotlin.collections.List

class ListcapaiankaloriAdapter(
  var list: List<ListcapaiankaloriRowModel>
) : RecyclerView.Adapter<ListcapaiankaloriAdapter.RowListcapaiankaloriVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcapaiankaloriVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcapaiankalori,parent,false)
    return RowListcapaiankaloriVH(view)
  }

  override fun onBindViewHolder(holder: RowListcapaiankaloriVH, position: Int) {
    val listcapaiankaloriRowModel = ListcapaiankaloriRowModel()
    // TODO uncomment following line after integration with data source
    // val listcapaiankaloriRowModel = list[position]
    holder.binding.listcapaiankaloriRowModel = listcapaiankaloriRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcapaiankaloriRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListcapaiankaloriRowModel
    ) {
    }
  }

  inner class RowListcapaiankaloriVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcapaiankaloriBinding = RowListcapaiankaloriBinding.bind(itemView)
  }
}
